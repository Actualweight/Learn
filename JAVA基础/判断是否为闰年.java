import java.util.Scanner;

public class 判断是否为闰年 {
    public static void main(String[] args) {
        System.out.println("请输入一个四位数的年份：");
        try (Scanner scanner=new Scanner(System.in)) {
           int n = scanner.nextInt();
           if((n%4==0&n%100!=0)|n%400==0){
               System.out.println("是闰年");
             } else{
               System.out.println("不是闰年");
           }
        }
    }
}
