import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Writer {
    public static void write(Path file, List<String> text) {
        try {
            Files.write(file,text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
