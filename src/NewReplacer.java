public class NewReplacer {
    public static StringBuilder replace(StringBuilder text){
        String[] stringLines = text.toString().split("\\n");
        int linesCount = 7;
        for (int i = 0; i < linesCount; i++) {
            var aLine = new StringBuilder(stringLines[i]);
            SharpReplacer.replace(aLine);
            TagsDeleter.delete(aLine);
            NewLineSignAdd.addOn(aLine);
            stringLines[i] = aLine.toString();
        }
        var changedText = new StringBuilder();
        for (String line : stringLines) {
            changedText.append(line).append("\n");
        }
        return changedText;
    }
}
