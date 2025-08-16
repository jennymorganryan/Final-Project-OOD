package Option1;

import java.io.IOException;
import java.nio.file.Path;

/**
 * The interface Output writer
 *
 * @param <T> the type parameter
 */
public interface OutputWriter<T> {
    /**
     * Write.
     *
     * @param file the file
     * @param data the data
     * @throws IOException the io exception
     */
    void write(Path file, T data) throws IOException;
}