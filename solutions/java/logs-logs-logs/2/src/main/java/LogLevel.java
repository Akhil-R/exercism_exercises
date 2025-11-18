public enum LogLevel {
    TRACE (1),
    DEBUG (2),
    INFO (4),
    WARNING (5),
    ERROR (6),
    FATAL (42),
    UNKNOWN (0);

    private final int logValue;
    
    LogLevel(int logValue){
        this.logValue = logValue;
    }

    public int getLogValue(){
        return this.logValue;
    }
}
