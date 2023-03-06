import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NewReplacer {
    public static void replace(File file) throws IOException {
        var scIn = new Scanner(file);
        while (scIn.hasNext()) {
            var aLine = new StringBuilder(scIn.nextLine());
            SharpReplacer.replace(aLine);
            TagsDeleter.delete(aLine);
            NewLineSignAdd.addOn(aLine);
            System.out.println(aLine);
        }
    }
}
