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
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = string.length();
    
        while (i < len) {
            char c = string.charAt(i);
            if (c == '\t' || c == '\n' || c == '\r') {
                // 跳过一整段连续的 \t \n \r
                while (i < len) {
                    char x = string.charAt(i);
                    if (x != '\t' && x != '\n' && x != '\r') {
                        break;
                    }
                    i++;
                }
                sb.append(' ');
            } else {
                // 找到下一段非空白，一次性截取
                int start = i;
                while (i < len) {
                    char x = string.charAt(i);
                    if (x == '\t' || x == '\n' || x == '\r') {
                        break;
                    }
                    i++;
                }
                sb.append(string.substring(start, i));
            }
        }
    
        return sb.toString().trim();
    }
}
