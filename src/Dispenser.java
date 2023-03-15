import java.util.List;

public class Dispenser {
    public static FileTypes isNoteNew(List<String> text) {
        if (text.size() == 0 || text.get(0).length() < 5) {
            return FileTypes.NOT;
        }
        String start = text.get(0).substring(0, 5);
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
