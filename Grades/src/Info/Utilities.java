package Info;

public final class Utilities {
    public static boolean isAlpha(String s) {
        return s != null && s.matches("[a-zA-Z]+");
    }

    public static boolean isNumeric(String s) {
        return s != null && s.matches("^[0-9]*$");
    }

    public static boolean isAlphaNumeric(String s) {
        return s != null && s.matches("^[a-zA-Z0-9]*$");
    }

}
