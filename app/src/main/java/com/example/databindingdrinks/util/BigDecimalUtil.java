package com.example.databindingdrinks.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by User on 2/6/2018.
 */

public class BigDecimalUtil {

    /**
     * First Case
     * Method for converting Big Decimals in this case to a String
     * Second Case
     * Method now converts Double to a String*/

    public static String getValue(BigDecimal value){
//        DecimalFormat df = new DecimalFormat("###,###,###.00");
//        return String.valueOf(df.format(value));
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        return String.valueOf(df.format(value));
    }
    /*
        For rating bar (actual rating)
     */
    public static float getFloat(BigDecimal value){
        return value.floatValue();
    }


}
