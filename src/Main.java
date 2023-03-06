import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        var file = new File("input.txt");
        var scIn = new Scanner(file);

        String firstLine = scIn.nextLine();
        scIn.close();
        if (Dispenser.isNoteNew(firstLine)) {
            NewReplacer.replace(file);
        } else {
            OldReplacer.replace(file);
        }
    }
}