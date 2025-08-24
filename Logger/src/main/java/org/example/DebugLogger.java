package org.example;

public class DebugLogger extends Logger{
    DebugLogger(Logger nextLogger)
    {
        super(nextLogger);
    }
    public void log(Severity level, String message)
    {
        if(level == Severity.DEBUG)
        {
            System.out.println("DEBUG: " + message);
        }
        else {
            super.log(level,message);
        }
    }
}
