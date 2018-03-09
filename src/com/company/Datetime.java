package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by khan on 2/9/17.
 */
public class Datetime {
     static int  getDateTime(Date startDate, Date endDate){

        return (startDate.getDate()-endDate.getDate());
    }
    public static void main(String[] arg){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.JANUARY,180);
        System.out.println(calendar.getFirstDayOfWeek());
    }
}
