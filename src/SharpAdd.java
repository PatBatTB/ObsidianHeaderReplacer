public class SharpAdd {
    public static void addOn(StringBuilder aLine) {
        if (Character.isAlphabetic(aLine.charAt(0))) {
            aLine.insert(0, "### ");
        }
    }
}
