public class LogLevels {
    
    public static String message(String logLine) {
        return removeSpecChar(logLine.split(": ", 2)[1]);
    }

    public static String logLevel(String logLine) {
        return removeSpecChar(logLine.replaceAll(".*?\\[([^\\]]*)\\].*", "$1").toLowerCase());
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    private static String removeSpecChar(String string) {
        return string.replaceAll("[\\t\\n\\r]+", " ").trim();
    }
}
