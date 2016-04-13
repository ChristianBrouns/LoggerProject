package com.ivik.logger;


/**
 * Created by Christian on 1-2-2016.
 */
final class SimpleLogging implements Logger {

    @Override
    public void debug(String msg) {
        System.out.println( "*** DEBUG *** " + msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println( "*** WARNING *** " + msg);
    }

    @Override
    public void info(String msg) {
        System.out.println("*** INFO *** " + msg);
    }

    @Override
    public void error(String msg) {
        System.out.println("*** ERROR *** " + msg + " is not a valid number!");
    }
}
