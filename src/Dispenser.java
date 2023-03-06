public class Dispenser {
    public static boolean isNoteNew(String aLine) {
        return aLine.startsWith("#####");
    }
}
