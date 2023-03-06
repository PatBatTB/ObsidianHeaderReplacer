import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OldReplacer {
    public static void replace(File file) throws IOException {
        var scIn = new Scanner(file);
        while (scIn.hasNext()) {
            var aLine = new StringBuilder(scIn.nextLine());
            SharpAdd.addOn(aLine);
            NewLineSignAdd.addOn(aLine);
            System.out.println(aLine);

        }
        System.out.println("___");
    }
}
