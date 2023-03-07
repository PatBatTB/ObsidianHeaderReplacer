public class SharpReplacer {
    public static void replace(StringBuilder aLine) {
        if (aLine.toString().startsWith("#####")) {
            aLine.replace(0, 5, "###");
        }
    }
}
