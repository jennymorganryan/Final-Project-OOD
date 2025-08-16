import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CsvParserTest {

    private CsvParser parser;
    private Path projectCsvPath;

    @BeforeEach
    void setup() {
        parser = new CsvParser();
        // you told me your file lives here:
        projectCsvPath = Path.of("src/test/java/resources/ski_lift_data.csv");
    }

    @Test
    void parsesTinyCsv() throws Exception {
        String csv = ""
                + "resort,day,skier,lift,time\n"
                + "0,1,123,5,0\n"
                + "0,1,123,21,75\n";

        Path tmp = Files.createTempFile("tiny", ".csv");
        Files.writeString(tmp, csv);

        List<SkierRide> rides = parser.readAll(tmp);

        assertEquals(2, rides.size());
        SkierRide r0 = rides.get(0);
        assertEquals("0", r0.getResortId());
        assertEquals("1", r0.getDayNumber());
        assertEquals("123", r0.getSkierId());
        assertEquals(5, r0.getLiftId());
        assertEquals(0, r0.getMinuteOffset());
    }

    @Test
    void parsesCsvByHeaderNamesAnyOrder() throws Exception {
        // columns scrambled on purpose to confirm header-name parsing
        String csv = ""
                + "day,time,resort,lift,skier\n"
                + "1,60,0,21,456\n";

        Path tmp = Files.createTempFile("reordered", ".csv");
        Files.writeString(tmp, csv);

        List<SkierRide> rides = parser.readAll(tmp);

        assertEquals(1, rides.size());
        SkierRide r = rides.get(0);
        assertEquals("0", r.getResortId());
        assertEquals("1", r.getDayNumber());
        assertEquals("456", r.getSkierId());
        assertEquals(21, r.getLiftId());
        assertEquals(60, r.getMinuteOffset());
    }

    @Test
    void readsYourRealCsvFromProjectPath() throws Exception {
        assertTrue(Files.exists(projectCsvPath),
                "Expected file at src/test/java/resources/ski_lift_data.csv");

        List<SkierRide> rides = parser.readAll(projectCsvPath);
        assertTrue(rides.size() > 0, "Expected at least one row");
    }
}
