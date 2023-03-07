public class OldReplacer {
    public static StringBuilder replace(StringBuilder text) {
        String[] stringLines = text.toString().split("\\n");
        int linesCount = Math.min(stringLines.length, 6);
        for (int i = 0; i < linesCount; i++) {
            var aLine = new StringBuilder(stringLines[i]);
            if (aLine.isEmpty()) {
                continue;
            }
            SharpAdd.addOn(aLine);
            NewLineSignAdd.addOn(aLine);
            if (i == 5) {
                stringLines[i] = aLine.append("\n___").toString();
            }
            stringLines[i] = aLine.toString();
        }
        var changedText = new StringBuilder();
        for (String line : stringLines) {
            changedText.append(line).append("\n");
        }
        return changedText;
    }
}
