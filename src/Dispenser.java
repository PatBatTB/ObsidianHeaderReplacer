public class Dispenser {
    public static FileTypes isNoteNew(StringBuilder text) {
        String start = text.substring(0, 5);
        switch (start) {
            case "#####" -> {
                return FileTypes.NEW;
            }
            case "Tags:" -> {
                return FileTypes.OLD;
            }
            default -> {
                return FileTypes.NOT;
            }
        }
    }
}
