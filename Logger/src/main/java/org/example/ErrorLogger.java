package org.example;

public class ErrorLogger extends Logger{

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(Severity level, String message)
    {
        if(level == Severity.ERROR)
        {
            System.out.println("ERROR: " + message);
        }
        else
        {
            super.log(level,message);
        }
    }
}
