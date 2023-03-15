import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "./files";
        String fileExtension = ".md";

        Path dir = Path.of(directoryPath);
        if (!Files.isDirectory(dir)) {
            throw new IllegalArgumentException("It's not a folder.");
        }

        List<Path> fileList = FileScanner.getList(dir, fileExtension);

        for (Path file : fileList) {
            FileHandler.execute(file);
        }
    }
}