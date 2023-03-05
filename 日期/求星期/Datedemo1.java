package 日期.求星期;

import java.util.Calendar;

public class Datedemo1 {
    public static void main(String[] args) {
        //打印2018年3月12日星期数并输出
        Calendar c = Calendar.getInstance();
        //1.设置时间
        c.set(2018,2,12);
        //2.求出星期数
        int week = c.get(Calendar.DAY_OF_WEEK)-1;
        if(week == 0)
        System.out.println("星期日");
        else
        System.out.println("星期："+week);
    }
}
