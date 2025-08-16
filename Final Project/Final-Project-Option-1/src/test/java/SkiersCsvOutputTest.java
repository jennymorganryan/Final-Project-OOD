import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SkiersCsvOutputTest {

    @TempDir
    Path outDir; // temp folder per test run

    private SkiersCsvOutput writer;

    @BeforeEach
    void setup() {
        writer = new SkiersCsvOutput();
    }

    @Test
    void writesHeaderAndRows() throws Exception {

        Map<String, SkierData> map = new LinkedHashMap<>();
        SkierData s10 = new SkierData(); s10.addRide(200); s10.addRide(500); // 700
        SkierData s11 = new SkierData(); s11.addRide(500);                   // 500
        map.put("10", s10);
        map.put("11", s11);

        Path file = outDir.resolve("skiers.csv");
        writer.write(file, List.copyOf(map.entrySet()));

        String text = Files.readString(file);
        assertTrue(text.startsWith("SkierID, Vertical total"));
        assertTrue(text.contains("10, 700"));
        assertTrue(text.contains("11, 500"));
    }
}