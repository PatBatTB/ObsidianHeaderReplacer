public class Switcher {
    public static StringBuilder switchReplacer(FileTypes type, StringBuilder text) {
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
