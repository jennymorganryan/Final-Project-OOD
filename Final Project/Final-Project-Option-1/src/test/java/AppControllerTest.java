import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class AppControllerTest {

    @TempDir
    Path outDir;

    // dependencies created in setup
    private CsvParser parser;
    private LiftData liftData;
    private SkiersCsvOutput skiersOut;
    private LiftsCsvOutput liftsOut;
    private HoursCsvOutput hoursOut;
    private AppController app;

    @BeforeEach
    void setup() {
        parser = new CsvParser();
        liftData = new LiftData();
        skiersOut = new SkiersCsvOutput();
        liftsOut = new LiftsCsvOutput();
        hoursOut = new HoursCsvOutput();
        app = new AppController(parser, liftData, skiersOut, liftsOut, hoursOut);
    }

    @Test
    void writesAllThreeReportsFromSmallCsv() throws Exception {
        //  input covering a few hours/lifts
        String csv = ""
                + "resort,day,skier,lift,time\n"
                + "0,1,10,1,0\n"       // hour 0
                + "0,1,10,21,59\n"     // hour 0
                + "0,1,11,21,60\n"     // hour 1
                + "0,1,12,40,119\n"    // hour 1
                + "0,1,12,40,359\n";   // hour 5

        Path input = Files.createTempFile("small", ".csv");
        Files.writeString(input, csv);

        app.run(input, outDir);

        Path skiers = outDir.resolve("skiers.csv");
        Path lifts  = outDir.resolve("lifts.csv");
        Path hours  = outDir.resolve("hours.csv");

        assertTrue(Files.exists(skiers), "skiers.csv should exist");
        assertTrue(Files.exists(lifts),  "lifts.csv should exist");
        assertTrue(Files.exists(hours),  "hours.csv should exist");

        //  header/content checks
        String skiersText = Files.readString(skiers);
        assertTrue(skiersText.startsWith("SkierID, Vertical total"));

        String liftsText = Files.readString(lifts);
        assertTrue(liftsText.contains("LiftID, Number of Rides"));
        assertTrue(liftsText.contains("1, 1"));
        assertTrue(liftsText.contains("21, 2"));
        assertTrue(liftsText.contains("40, 2"));

        String hoursText = Files.readString(hours);
        assertTrue(hoursText.contains("Hour #1"));
        assertTrue(hoursText.contains("Hour #6"));
    }
}