public class TagsDeleter {
    public static void delete(StringBuilder aLine) {
        if (aLine.charAt(0) == '#') {
            boolean isFound = true;
            while (isFound) {
                int startIndex = aLine.indexOf("<");
                int endIndex = aLine.indexOf(">", startIndex + 1);
                if (startIndex != -1 || endIndex != -1) {
                    aLine.delete(startIndex, endIndex + 1);
                } else {
                    isFound = false;
                }

            }
        }
    }
}
