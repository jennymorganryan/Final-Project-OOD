/**
 * Overview
 * This class writes hours.csv.
 * There are six sections, one for each hour of the ski day.
 * For each section we write two header lines
 *   Hour #n
 *   LiftID, Number of Rides
 * Then we write the ten busiest lifts for that hour.
 * We put a blank line between sections to make the file easier to read.
 */
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.util.List;

public class HoursCsvOutput {

    /**
     * sections is a list with six items
     *   sections.get(h) returns a list for hour h
     *   each inner item is [liftId, ridesForThatHourAndLift]
     */
    public void write(Path file, List<List<int[]>> sections) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(file)) {
            for (int i = 0; i < sections.size(); i++) {
                // first header line for this hour
                w.write("Hour #" + (i + 1) + "\n");

                // second header line for this hour
                w.write("LiftID, Number of Rides\n");

                // write up to ten rows for this hour
                for (int[] r : sections.get(i)) {
                    int liftId = r[0];
                    int count = r[1];
                    w.write(liftId + ", " + count + "\n");
                }

                // blank line after each section except the last one
                if (i < sections.size() - 1) {
                    w.write("\n");
                }
            }
        }
    }
}
