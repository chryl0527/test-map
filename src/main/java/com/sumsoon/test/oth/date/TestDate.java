package com.sumsoon.test.oth.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By Chr on 2019/5/24.
 */
public class TestDate {
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

        Date date = new Date();

        String format = simpleDateFormat.format(date);
        System.out.println("date->String:" + format);
        Date parse = simpleDateFormat.parse(format);
        System.out.println("String->date:" + parse);

        System.out.println("========");
        long time = date.getTime();
        System.out.println("date->long:" + time);
        String format1 = simpleDateFormat.format(new Date(Long.valueOf(time)));
        System.out.println("long->String:" + format1);
    }

    public String convertDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);

        return format;
    }

    public String convertDate2(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);

        return format;
    }
}
