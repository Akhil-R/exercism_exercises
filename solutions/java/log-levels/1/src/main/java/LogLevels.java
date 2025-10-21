public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        String result = arr[1].trim();
        return result;

    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[")+1;
        int end = logLine.indexOf("]");

        return logLine.substring(start,end).toLowerCase();
        /*
        String[] parts = logLine.split(":");
        String logLevel = parts[0].trim();
        logLevel = logLevel.substring(1,logLevel.length()-1).trim();
        return logLevel.toLowerCase(); */
        
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+logLevel(logLine)+")";
    }
}
