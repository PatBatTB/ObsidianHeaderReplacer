import java.util.List;

public class OldReplacer {
    public static List<String> replace(List<String> text) {
        int linesCount = Math.min(text.size(), 6);
        for (int i = 0; i < linesCount; i++) {
            var aLine = new StringBuilder(text.get(i));
            if (aLine.isEmpty()) {
                continue;
            }
            SharpAdd.addOn(aLine);
            NewLineSignAdd.addOn(aLine);
            if (i == 5) {
                text.set(i, aLine.append("\n___").toString());
            }
            text.set(i, aLine.toString());
        }
        return text;
    }
}
