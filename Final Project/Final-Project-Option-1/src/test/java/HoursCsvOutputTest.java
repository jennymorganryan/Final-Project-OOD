import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HoursCsvOutputTest {

    @TempDir
    Path outDir;

    private HoursCsvOutput writer;

    @BeforeEach
    void setup() {
        writer = new HoursCsvOutput();
    }

    @Test
    void writesSixSectionsFormat() throws Exception {
        // 6 sections; first two have some rows to check formatting/content
        List<List<int[]>> sections = List.of(
                List.of(new int[]{1, 2}, new int[]{21, 3}),
                List.of(new int[]{40, 1}),
                List.of(),
                List.of(),
                List.of(),
                List.of()
        );

        Path file = outDir.resolve("hours.csv");
        writer.write(file, sections);

        String text = Files.readString(file);
        assertTrue(text.contains("Hour #1"));
        assertTrue(text.contains("Hour #2"));
        assertTrue(text.contains("Hour #3"));
        assertTrue(text.contains("Hour #4"));
        assertTrue(text.contains("Hour #5"));
        assertTrue(text.contains("Hour #6"));
        assertTrue(text.contains("LiftID, Number of Rides"));
        assertTrue(text.contains("21, 3"));
        assertTrue(text.contains("1, 2"));
        assertTrue(text.contains("40, 1"));
    }
}