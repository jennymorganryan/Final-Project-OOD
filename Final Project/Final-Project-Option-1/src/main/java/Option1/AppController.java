package Option1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * This class runs the whole program from start to finish.
 * Steps
 *   1. read every line from the input CSV file into a list of Option1.SkierRide objects
 *   2. for each Option1.SkierRide update three things
 *        a. totals for that skier
 *        b. ride counts for that lift
 *        c. ride counts for that hour and lift
 *   3. sort and shape the results
 *   4. write three CSV files
 *
 * Where we store things
 *   perSkier is a Map from skierId to Option1.SkierData
 *   ridesPerLift is an array where index is the lift number
 *   ridesPerHourLift is a small table with 6 hours and 40 lifts
 */
public class AppController {

    private final Parser parser;
    private final LiftData liftData;
    private final OutputWriter<List<Map.Entry<String, SkierData>>> skiersOut;
    private final OutputWriter<List<int[]>> liftsOut;
    private final OutputWriter<List<List<int[]>>> hoursOut;

    //all skiers live here during processing
    //the key is the skier id, the value is the running totals for that skier
    private final Map<String, SkierData> perSkier = new HashMap<>();

    //count rides per lift
    // array size is 41 so we can use index 1 to 40 and ignore index 0
    private final long[] ridesPerLift = new long[41];

    //count rides per hour per lift
    //there are 6 hours from 9 to 3
    //hour 0 covers 9 to 10, hour 1 covers 10 to 11, and so on
    private final int[][] ridesPerHourLift = new int[6][41];

    public AppController(Parser parser,
                         LiftData liftData,
                         OutputWriter<List<Map.Entry<String, SkierData>>> skiersOut,
                         OutputWriter<List<int[]>> liftsOut,
                         OutputWriter<List<List<int[]>>> hoursOut) {
        this.parser = parser;
        this.liftData = liftData;
        this.skiersOut = skiersOut;
        this.liftsOut = liftsOut;
        this.hoursOut = hoursOut;
    }

    /**
     * Do the complete job using the given input file and output folder
     */
    public void run(Path inputCsv, Path outputDir) throws IOException {
        //make sure the output folder exists
        Files.createDirectories(outputDir);

        //read the whole CSV file into a list of rides
        List<SkierRide> rides = parser.readAll(inputCsv);

        //go through each ride one by one and update our counts
        for (SkierRide r : rides) {
            int liftId = r.getLiftId();          // which lift was used
            int minute = r.getMinuteOffset();    // minutes after 9 am when the scan happened

            //work out which hour bucket this minute belongs to
            //divide minutes by 60 to get hour index from 0 to 5
            int hourIndex = minute / 60;
            if (hourIndex < 0) hourIndex = 0;
            if (hourIndex > 5) hourIndex = 5;

            //how many vertical meters was this ride worth
            int vertical = liftData.getVerticalForLift(liftId);

            //update the totals for this skier
            SkierData stats = perSkier.get(r.getSkierId());
            if (stats == null) {
                stats = new SkierData();
                perSkier.put(r.getSkierId(), stats);
            }
            stats.addRide(vertical); // add one ride and add that vertical

            // update totals for this lift for the whole day
            ridesPerLift[liftId]++;

            //update totals for this hour and lift
            ridesPerHourLift[hourIndex][liftId]++;
        }

        //make a list of all skiers so we can sort them by total vertical
        List<Map.Entry<String, SkierData>> topSkiers = new ArrayList<>(perSkier.entrySet());
        topSkiers.sort((a, b) -> Long.compare(b.getValue().getVertical(), a.getValue().getVertical()));

        //keep only the first 100 if there are more
        if (topSkiers.size() > 100) {
            topSkiers = topSkiers.subList(0, 100);
        }

        //build the lift table in lift number order
        List<int[]> liftsRows = new ArrayList<>();
        for (int id = 1; id <= 40; id++) {
            liftsRows.add(new int[]{id, (int) ridesPerLift[id]});
        }

        //build the six hour sections
        List<List<int[]>> hourSections = new ArrayList<>();
        for (int h = 0; h < 6; h++) {
            List<int[]> rows = new ArrayList<>();
            for (int id = 1; id <= 40; id++) {
                rows.add(new int[]{id, ridesPerHourLift[h][id]});
            }
            //sort by ride count for that hour, highest first
            rows.sort((x, y) -> Integer.compare(y[1], x[1]));
            // keep top 10 lifts for this hour
            if (rows.size() > 10) rows = rows.subList(0, 10);
            hourSections.add(rows);
        }

        // write all three reports
        skiersOut.write(outputDir.resolve("skiers.csv"), topSkiers);
        liftsOut.write(outputDir.resolve("lifts.csv"), liftsRows);
        hoursOut.write(outputDir.resolve("hours.csv"), hourSections);
    }
}