public class NewLineSignAdd {
    public static void addOn(StringBuilder aLine) {
        if (aLine.charAt(0) == '#') {
            int index = aLine.indexOf(":");
            if (aLine.length() <= index + 1) {
                aLine.append("\n");
            } else {
                String subLine = aLine.substring(index + 1);
                for (int i = 0; i < subLine.length(); i++) {
                    if (subLine.charAt(i) != ' ') {
                        index += i;
                        break;
                    }
                }
                aLine.insert(index + 1, "\n");
            }
        }
    }
}
