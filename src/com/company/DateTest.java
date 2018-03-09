package com.company;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by khan on 4/27/17.
 */
public class DateTest {
  public static void main(String[] args) throws ParseException {

     DateTimeFormatter DATE_TIME_FORMATTER = ISODateTimeFormat.dateTime();
    Date curentdate = new Date();
    System.out.println("in simple date format");
    System.out.println(curentdate);
    System.out.println("in iso date format");

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    System.out.println(format.format(curentdate));

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(curentdate);
    calendar.add(Calendar.DATE, 14);
    curentdate = calendar.getTime();
    System.out.println(curentdate);

    System.out.println("");
    Calendar cal = Calendar.getInstance();
    Date date = new Date();
    cal.setTime(date);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);
    System.out.println(cal.getTime());

    System.out.println("after change time as zero and set in iso formate ");
    System.out.println(format.format(cal.getTime()));

    DateTime startDate = DATE_TIME_FORMATTER.parseDateTime(format.format(cal.getTime()));

    System.out.println("after change in joda date time");
    System.out.println(startDate);




    System.out.println("");
    Calendar cale = Calendar.getInstance();
    cale.setTime(date);
    cale.set(Calendar.HOUR_OF_DAY, 23);
    cale.set(Calendar.MINUTE, 59);
    cale.set(Calendar.SECOND, 59);
    cale.set(Calendar.MILLISECOND, 0);
    System.out.println(cale.getTime());

    System.out.println("after change in last houre and set in iso format");
    System.out.println(format.format(cale.getTime()));

    DateTime endDate = DATE_TIME_FORMATTER.parseDateTime(format.format(cale.getTime()));

    System.out.println("after change joda date time end date");
    System.out.println(endDate);
  }
}
