package com.ws.config.util;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/**
 * Created by vikas on 02-07-2019.
 */
public class DateUtil {

    public static final String DATE_FORMAT_DD_MM_YYYY_HH_MM_SS = "dd-MM-yyyy hh:mm:ss";


    public static Date convertStringToDate(String utilDate, String format) {
        Date newDate = null;
        if (null != utilDate && null != format) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            sdf.setLenient(false);
            try {
                newDate = sdf.parse(utilDate);
            } catch (ParseException pe) {
                return null;
            }

        }
        return newDate;
    }

    public static Date addTimeUnitToDate(Date date, int timeUnitValue,String timeUnitDesc) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        switch(timeUnitDesc){
            case "HOUR":
                calendar.add(Calendar.HOUR_OF_DAY, timeUnitValue);
                break;
            case "MIN":
                calendar.add(Calendar.MINUTE, timeUnitValue);
                break;
            case "SEC":
                calendar.add(Calendar.SECOND, timeUnitValue);
                break;

        }
        return calendar.getTime();
    }

    public static String convertUtilDateToString(Date utilDate, String format) {



        SimpleDateFormat sdf = new SimpleDateFormat(format);
        if (utilDate == null) {
            return "";
        } else {
            return sdf.format(utilDate);
        }
    }



}
