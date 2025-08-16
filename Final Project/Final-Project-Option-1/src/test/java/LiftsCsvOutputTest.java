import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LiftsCsvOutputTest {

    @TempDir
    Path outDir;

    private LiftsCsvOutput writer;

    @BeforeEach
    void setup() {
        writer = new LiftsCsvOutput();
    }

    @Test
    void writesHeaderAndRows() throws Exception {
        List<int[]> rows = List.of(
                new int[]{1, 3},
                new int[]{21, 5}
        );

        Path file = outDir.resolve("lifts.csv");
        writer.write(file, rows);

        String text = Files.readString(file);
        assertTrue(text.startsWith("LiftID, Number of Rides"));
        assertTrue(text.contains("1, 3"));
        assertTrue(text.contains("21, 5"));
    }
}