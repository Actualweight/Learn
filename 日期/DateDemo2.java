package 日期;

import java.util.Calendar;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);
        //获得当前年月日时分秒
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        //星期天时一周的第一天
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
        System.out.println("星期:"+week);
    }
}
