package com.una.kawaii.common.util;

import com.una.kawaii.common.constant.ICommonConstant.TimeStampManipulation;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created on 9/29/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class GeneralConverter {

    public String getMainUrl( String completeURl ){
        String result = completeURl.substring( 7, completeURl.length() );
        result  = removeLastChar( result );
        return result ;
    }

    /**
     * Utility to remove last char of a String ( usually for URLBuilder in Web Service )
     * @param s String
     * @return
     */
    public String removeLastChar( String s ){
        if ( s!= null && !s.equals("") ){
            return s.substring( 0 , s.length()-1 );
        }else{
            return "";
        }
    }

    /**
     * Rounding up a value with N decimal places
     * @param value double
     * @param decimalPlaces int
     * @return double
     */
    public double roundingUp(double value, int decimalPlaces){
        BigDecimal bd = new BigDecimal( value );
        bd = bd.setScale( decimalPlaces, BigDecimal.ROUND_UP);
        value = bd.doubleValue();
        return value;
    }

    /**
     * Convert from Mbps To Kbps
     * @param value double
     * @return double
     */
    public double mbpsToKbps(double value){
        return value * 1024;
    }

    /**
     * Convert string with first letter upper case
     * @param s String
     * @return String
     */
    public String capitalize(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char first = s.charAt(0);
        if (Character.isUpperCase(first)) {
            return s;
        } else {
            return Character.toUpperCase(first) + s.substring(1);
        }
    }

    /**
     * Convert TimeStamp into Time format ( hh:mm:ss )
     * @param date Date
     * @return String
     */
    public String getTimeStampToFormatTime( Date date ){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( TimeStampManipulation.TIMESTAMP_TO_TIME );
        return simpleDateFormat.format( date );
    }

    /**
     * Convert TimeStamp into Date format
     * @param date Date
     * @return String
     */
    public String getTimeStampToFormatDate( Date date , String pattern ){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( pattern );
        return simpleDateFormat.format( date );
    }


}
