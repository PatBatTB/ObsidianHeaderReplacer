import java.util.List;

public class Switcher {
    public static List<String> switchReplacer(FileTypes type, List<String> text) {
        switch (type) {
            case NEW -> {
                return NewReplacer.replace(text);
            }
            case OLD -> {
                return OldReplacer.replace(text);
            }
            default -> {
                return text;
            }
        }
    }
}
