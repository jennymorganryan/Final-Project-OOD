/**
 *
 * This class opens the CSV file, reads the header to learn column names,
 * then reads each remaining line and turns it into a SkierRide object.
 *
 * Your file has these column names
 *   resort, day, skier, lift, time
 * The code below looks up those names in the header, so it does not care about order.
 */
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvParser {

    /**
     * Read the entire CSV file and return a list of SkierRide objects.
     * Works for a header with these names exactly:
     *   resort, day, skier, lift, time
     */
    public List<SkierRide> readAll(Path csvPath) throws IOException {
        List<SkierRide> out = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(csvPath)) {
            //read the header line and build a map from column name to position
            String header = br.readLine();
            if (header == null) return out; // empty file

            String[] head = header.split(",", -1);
            Map<String, Integer> index = new HashMap<>();
            for (int i = 0; i < head.length; i++) {
                String key = head[i].trim().toLowerCase();
                index.put(key, i);
            }

            //find required positions by name
            int resortIdx = requiredIndex(index, "resort");
            int dayIdx    = requiredIndex(index, "day");
            int skierIdx  = requiredIndex(index, "skier");
            int liftIdx   = requiredIndex(index, "lift");
            int timeIdx   = requiredIndex(index, "time");

            //read each data line
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] t = line.split(",", -1);
                //skip if the row is shorter than the header
                if (t.length <= Math.max(Math.max(resortIdx, dayIdx), Math.max(Math.max(skierIdx, liftIdx), timeIdx))) {
                    continue;
                }

                //pull values by header position
                String resortId  = t[resortIdx];
                String dayNumber = t[dayIdx];
                String skierId   = t[skierIdx];

                int liftId;
                int minuteOffset;
                try {
                    liftId = Integer.parseInt(t[liftIdx].trim());
                    minuteOffset = Integer.parseInt(t[timeIdx].trim());
                } catch (NumberFormatException e) {
                    //skip this line if numbers are not valid
                    continue;
                }

                out.add(new SkierRide(resortId, dayNumber, minuteOffset, skierId, liftId));
            }
        }

        return out;
    }

    //helper that throws a clear error if a required column is missing
    private static int requiredIndex(Map<String, Integer> index, String name) {
        Integer pos = index.get(name);
        if (pos == null) {
            throw new IllegalArgumentException("Input CSV is missing a required column named: " + name);
        }
        return pos;
    }
}
