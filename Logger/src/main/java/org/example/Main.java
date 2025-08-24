package org.example;

public class Main {
    public static void main(String[] args) {
        Logger logObject = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logObject.log(Severity.ERROR,"Its erroring boss!!");
        logObject.log(Severity.INFO,"Just sending some info bro..");
        logObject.log(Severity.DEBUG,"Time for a debugging session");
    }
}