import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {
    public static void execute(File file) throws IOException {
        var scIn = new Scanner(file);
        var text = new StringBuilder();
        while (scIn.hasNext()) {
            text.append(scIn.nextLine()).append("\n");
        }
        scIn.close();

        text = Switcher.switchReplacer(Dispenser.isNoteNew(text), text);

        var pw = new PrintWriter(file);
        pw.write(text.toString());
        pw.close();
    }
}
