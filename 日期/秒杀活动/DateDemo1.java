package 日期.秒杀活动;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        //思路：字符串转化Date，通过getTime比较日期大小
    String start = "2023年11月11日 00:00:00";
    String end = "2023年11月11日 00:10:00";
    String buy1 = "2023年11月10日 23:59:59";
    String buy2 = "2023年11月11日 00:01:00";
    String buy3 = "2023年11月11日 00:11:00";
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    //字符串转Date
    Date startDate = sdf.parse(start);
    Date endDate = sdf.parse(end);
    Date buy1Date = sdf.parse(buy1);
    Date buy2Date = sdf.parse(buy2);
    Date buy3Date = sdf.parse(buy3);
    if (buy1Date.getTime() >= startDate.getTime()&&buy1Date.getTime()<=endDate.getTime())
    System.out.println("小明可以参加秒杀活动");
    else
    System.out.println("小明不可以参加秒杀活动");
    if (buy2Date.getTime() >= startDate.getTime()&&buy2Date.getTime()<=endDate.getTime())
    System.out.println("小红可以参加秒杀活动");
    else
    System.out.println("小红不可以参加秒杀活动");
    if (buy3Date.getTime() >= startDate.getTime()&&buy3Date.getTime()<=endDate.getTime())
    System.out.println("小黑可以参加秒杀活动");
    else
    System.out.println("小黑不可以参加秒杀活动");
    }

}
