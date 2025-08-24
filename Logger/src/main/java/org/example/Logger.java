package org.example;

public abstract class Logger {

    Logger nextLogger;

    Logger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void log(Severity level, String message)
    {
        if(nextLogger!=null)
        {
            nextLogger.log(level,message);
        }
    }
}
