package com.ivik.app;

import com.ivik.logger.LogFactory;
import com.ivik.logger.LogType;
import com.ivik.logger.Logger;

/**
 * Created by Christian on 1-2-2016.
 */
public class MyUtils {
    Logger logger = LogFactory.getLogger();

    public MyUtils(LogType type) {
            }

    public boolean getInt(String intString) {
        boolean ok = false;
        logger.info(" checking string " + intString);

        try {
            int value = Integer.parseInt(intString);
            ok = true;
            logger.debug("Alles is ok");
        }
        catch (NumberFormatException e) {
            logger.warn(e.getMessage());
            logger.error(e.getMessage());
        }

        return ok;
    }

}

