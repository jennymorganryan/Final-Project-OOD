package Option1;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.util.List;


/**
 * This class writes lifts.csv.
 * The first line must be exactly
 *   LiftID, Number of Rides
 * Then we write one line for each lift number from 1 to 40.
 */

public class LiftsCsvOutput implements OutputWriter<List<int[]>> {
    /**
     * rows is a list where each item is an array with two numbers
     *   rows[i][0] is the lift id
     *   rows[i][1] is the number of rides for that lift
     */
    @Override
    public void write(Path file, List<int[]> rows) throws IOException {
        try (BufferedWriter w = Files.newBufferedWriter(file)) {
            // Header line
            w.write("LiftID, Number of Rides\n");

            // One line for each lift
            for (int[] r : rows) {
                int liftId = r[0];
                int count = r[1];
                w.write(liftId + ", " + count + "\n");
            }
        }
    }
}
