import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String directoryPath = "./files";
        File dir = new File(directoryPath);
        showFiles(dir.listFiles());

    }

    public static void showFiles(File[] files) throws IOException {
        if (files.length == 0) {
            System.out.println("Files not found.");
        }
        for (File file : files) {
            if (file.isDirectory()) {
                showFiles(file.listFiles()); // Calls same method again.
            } else if (file.getName().endsWith(".md")) {
                FileHandler.execute(file);
            }
        }
    }
}