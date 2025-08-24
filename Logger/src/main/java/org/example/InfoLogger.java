package org.example;

public class InfoLogger extends Logger{

    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(Severity level, String message)
    {
        if(level == Severity.INFO)
        {
            System.out.println("INFO: " + message);
        }
        else
        {
            super.log(level,message);
        }
    }
}
