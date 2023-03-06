public class SharpReplacer {
    public static void replace(StringBuilder aLine) {
        if (aLine.charAt(0) == '#') {
            aLine.replace(0, 5, "###");
        }
    }
}
