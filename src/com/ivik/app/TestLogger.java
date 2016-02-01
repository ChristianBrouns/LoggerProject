package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.LogType;

/**
 * Created by Christian on 1-2-2016.
 */
public class TestLogger {
    public static void main(String[] args) {
        LogFactory.setLogger(LogType.SIMPLE);
        MyUtils firstTest = new MyUtils(LogType.SIMPLE);
        firstTest.getInt("125 en nog wat");

        System.out.println("----------------------------------------");

        LogFactory.setLogger(LogType.FANCY);
        MyUtils secondTest = new MyUtils(LogType.FANCY);
        secondTest.getInt("driehonderden5");
    }
}


/*
        In TestLogger in jouw standaard main methode
        met gebruik van LogFactory set the Logger to use to be LogType.SIMPLE.
        call the method of MyUtils with a string.
        Run jouw class .

        Stap 11
        Wijzig de TestLogger class te gebruiken LogType.FANCY
        Run jouw class.

        Stap 12 Commentaar:....

        */