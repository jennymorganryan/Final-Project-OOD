/**
 * Overview
 * This class writes skiers.csv.
 * The first line must be exactly
 *   SkierID, Vertical total
 * Then we write up to 100 rows for the skiers with the highest total vertical.
 */
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.util.List;
import java.util.Map;

public class SkiersCsvOutput {

    /**
     * Write the file at the given place
     * rows is a list of entries where the key is the skier id
     * and the value has the totals for that skier
     */
    public void write(Path file, List<Map.Entry<String, SkierData>> rows) throws IOException {
        //open the file to write text
        try (BufferedWriter w = Files.newBufferedWriter(file)) {
            // header line
            w.write("SkierID, Vertical total\n");

            // one line for each skier
            for (Map.Entry<String, SkierData> e : rows) {
                String skierId = e.getKey();
                long vertical = e.getValue().getVertical();
                w.write(skierId + ", " + vertical + "\n");
            }
        }
    }
}
