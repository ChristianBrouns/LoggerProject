package com.ivik.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Christian on 1-2-2016.
 */
final class FancyLogging implements Logger {

    @Override
    public void debug(String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** DEBUG *** " + msg);
    }

    @Override
    public void warn(String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** WARNING *** " + msg);
    }

    @Override
    public void info(String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** INFO *** " + msg);
    }

    @Override
    public void error(String msg) {
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        Date d = new Date();
        System.out.println(df.format(d) + " *** ERROR *** " + msg + " is not a valid number!");
    }

}