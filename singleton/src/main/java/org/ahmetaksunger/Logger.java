package org.ahmetaksunger;

public class Logger {

    private Logger() {
    }

    private Integer totalLogs = 0;

    private static final Logger instance = new Logger();

    public static Logger getInstance(){
        return instance;
    }

    public Integer getTotalLogs() {
        return totalLogs;
    }

    public void log(String message){
        System.out.println(message);
        totalLogs++;
    }

    public void log(Object o){
        System.out.println(o.toString());
        totalLogs++;
    }

}
