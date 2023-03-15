import java.util.List;

public class NewReplacer {
    public static List<String> replace(List<String> text){
        int linesCount = Math.min(text.size(), 7);
        for (int i = 0; i < linesCount; i++) {
            var aLine = new StringBuilder(text.get(i));
            if (aLine.isEmpty()) {
                continue;
            }
            SharpReplacer.replace(aLine);
            TagsDeleter.delete(aLine);
            NewLineSignAdd.addOn(aLine);
            text.set(i, aLine.toString());
        }
        return text;
    }
}
