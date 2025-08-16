package Option1;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * The interface Parser.
 */
public interface Parser {
        /**
         * Read all list.
         *
         * @param csvPath the csv path
         * @return the list
         * @throws IOException the io exception
         */
        List<SkierRide> readAll(Path csvPath) throws IOException;
}
