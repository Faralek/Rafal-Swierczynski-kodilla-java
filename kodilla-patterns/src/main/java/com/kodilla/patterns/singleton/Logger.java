package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logLogger = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (logLogger == null) {
            synchronized (Logger.class) {
                if (logLogger == null) {
                    logLogger = new Logger();
                }
            }
        }
        return logLogger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}