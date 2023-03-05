package 日期.求活了多久;

import java.util.Calendar;

public class DateDemo {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 =Calendar.getInstance();
        //设置生日
        c2.set(2000,0,1);
        //天数
        long d1 = (c1.getTimeInMillis()-c2.getTimeInMillis())/(1000*3600*24);
        System.out.println("活了"+d1+"天");
    }
}
