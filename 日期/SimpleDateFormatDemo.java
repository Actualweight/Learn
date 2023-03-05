package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
         //时间的格式化
    Date d1 = new Date();
        
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分钟ss秒 EE");
    String s1 = sdf.format(d1);
    System.out.println(s1);
    //数据转化
    String birth = "2020-10-01";
    SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
    //字符串转日期：字符串的格式和定义格式要一致
    Date date = sdf1.parse(birth);
    //日期转字符串
    sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
    String dateStr = sdf1.format(date);
    System.out.println(dateStr);
    }
   
}
