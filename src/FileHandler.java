import java.nio.file.Path;
import java.util.List;

public class FileHandler {
    public static void execute(Path file) {
        System.out.println(file.toAbsolutePath().normalize());

        List<String> text = Reader.read(file);
        text = Switcher.switchReplacer(Dispenser.isNoteNew(text), text);
        Writer.write(file, text);
    }
}
