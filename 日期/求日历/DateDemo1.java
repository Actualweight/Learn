package 日期.求日历;
import java.util.Calendar;
import java.util.Scanner;
public class DateDemo1 {
    public static void main(String[] args) {
        try (//输入日期输出当月日历
        Scanner in = new Scanner(System.in)) {
            System.out.println("请输入要查询的月份(yyyy-MM)");
            String str = in.next();
             //字符串拆分得到年和月 
            String[] s = str.split("-");
            int year = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            Calendar cal = Calendar.getInstance();
            //设置日期为这个月第一天
            cal.set(year, month-1,1);
            //获取第一天星期几
            int fi=cal.get(Calendar.DAY_OF_WEEK);
            //获取天数
            int day = cal.getActualMaximum(Calendar.DATE);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //第一行空格数
            int sp = fi-1;
            for (int i=0;i<sp;i++) {
                System.out.print("\t");
            }
            //日期
            for(int i=1;i<=day;i++){
                System.out.print(i+"\t");
                //每七个换一行
                if ((sp+i)%7==0) {
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
