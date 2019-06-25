package com.gooweb.jodatime;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;


/**
 * joda time 测试工具
 *
 * @author sunteng
 * @create 2019-06-25 下午 1:23
 **/
public class JodatimeUtilDemo {

    public static void main(String[] args) {

        DateTime dateTime = new DateTime();
        //减10分钟
        DateTime one = dateTime.minusMinutes(10);
        //加10分钟
        DateTime two = dateTime.plusMillis(10);
        System.out.println(dateTime);
        System.out.println(one);
        System.out.println(two);
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String print = fmt.print(two.getMillis());
        System.out.println(print);

        //构造
        DateTime dateTime1 = new DateTime(new Date());
        DateTime dateTime2 = dateTime1.plusDays(10);
        System.out.println(dateTime1);

        int i = dateTime2.compareTo(new DateTime());
        System.out.println(i);

    }
}
