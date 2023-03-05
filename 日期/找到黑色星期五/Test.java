package 日期.找到黑色星期五;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		System.out.println("请输入起始的年份：");
	int y=	scanner.nextInt();
		System.out.println("请输入打算输出未来的几年：");
	int num=scanner.nextInt();
	scanner.close();
	getBlackFri(y,num);
	}
	public static void getBlackFri(int year ,int num) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E");//日期格式对象
			int k=0;
			Calendar cal=Calendar.getInstance();//获得日历对象
			while(k<num) {
				for(int i=0;i<12;i++) {
					cal.set(year, i, 13);   //设置日期
					//判断是否是星期五
					if(5==(cal.get(Calendar.DAY_OF_WEEK)-1)) {
					//Calendar.DAY_OF_WEEK get和set的字段数字，指示一个星期中的某天
						System.out.println("黑色星期五："+sdf.format(cal.getTime()));//s输出格式化日期
						
					}
				}
				year++;
				k++;
			}
	}
	
    }

