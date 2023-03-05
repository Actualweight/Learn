package 使用方法运行程序;

import java.util.Scanner;
public class function {
    public static double x1(int a,int b,int c) {  
      return  (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    }
    public   static double x2(int a,int b,int c){
        return  (-b-Math.sqrt(b*b-4*a*c))/(2*a);

    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("请输入a：");
            int a =in.nextInt();
            System.out.println("请输入b：");
             int b =in.nextInt();
            System.out.println("请输入c：");
             int c =in.nextInt();
             System.out.println(x1(a,b,c));
             System.out.println(x2(a,b,c));
        }
    }
}
