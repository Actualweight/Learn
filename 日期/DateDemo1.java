package 日期;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //Date类构造方法
         //有参显示的是设置的时间
        Date date = new Date(1000*3600*24*365l);
        System.out.println(date);
       
        //空参显示当前时间
        Date date2 = new Date();
       //定义两个date对象比较哪个时间在前哪个时间在后
        Date date3 = new Date(444*555l);
        Date date4 = new Date(333*666l);
        if (date3.getTime() < date4.getTime()) {
            System.out.println("date3在前");
        }else{
            System.out.println("date4在前");
        }
    }
}
