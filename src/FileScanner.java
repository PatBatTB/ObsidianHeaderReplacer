import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileScanner {
    public static List<Path> getList(Path dir, String fileExtension) {
        List<Path> fileList;
        try (Stream<Path> stream = Files.walk(dir)) {
            fileList = stream
                    .filter(Files::isRegularFile)
                    .filter(s -> s.getFileName().toString().endsWith(fileExtension))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileList;
    }
}
