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


/*************************************************************************************************************************************************
* Commentaar: Door het maken van oa een Factory Class is het eenvoudig om van een Simple logger te switchen naar een meer geavanceerdere logger. *
* Het is eenvoudiger bij te houden doordat er alleen in de TestLogger wijzigingen worden gemaakt.                                                *
* Als de basis eenmaal goed werkt, is het ook makkelijk te debuggen.                                                                             *
**************************************************************************************************************************************************/