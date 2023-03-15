import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Reader {
    public static List<String> read(Path file) {
        List<String> text;
        try {
            text = Files.readAllLines(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
