public class LogLevels {
    
    public static String message(String logLine) {
        int start = logLine.indexOf(": ");
        return removeSpecChar(logLine.substring(start + 2));
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[');
        int end = logLine.indexOf(']');
        return removeSpecChar(logLine.substring(start + 1, end)).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }

    private static String removeSpecChar(String string) {
        return string.replaceAll("[\\t\\n\\r]+", " ").trim();
    }
}
