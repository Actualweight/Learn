package 使用方法运行程序;

import java.util.Scanner;

public class operation {
    double a;
    double b;
    char c;

    
    public double addition(double a, double b,char c) {
       double sum =0;
        if (c == '+') 
          sum=a+b; 
          System.out.println(a+"与"+b+"的和是"+sum);
          return sum;      
    }
    public double subtraction(double a, double b,char c) {
        double sum =0;
         if (c == '-') 
           sum=a-b; 
           System.out.println(a+"与"+b+"的差是"+sum);
           return sum;      
     }
     public double multiplication(double a, double b,char c) {
        double sum =0;
         if (c == '*') 
           sum=a*b; 
           System.out.println(a+"与"+b+"的积是"+sum);
           return sum;      
     }
     public double division(double a, double b,char c) {
        double sum =0;
        if(b==0)
        System.out.println("除数不能等于0！");
         else if (c == '/') 
           sum=a/b; 
           System.out.println(a+"与"+b+"的商是"+sum);
           return sum;      
     }
     public static void main(String[] args) {
        operation ope = new operation();
        System.out.println("请输入第一个数：");
        try (Scanner in = new Scanner(System.in)) {
            int a =in.nextInt();

            System.out.println("请输入第二个数：");
            int b =in.nextInt();

            System.out.println("请输入运算符号：");
            char c = in.next().charAt(0);
            if (c=='+') 
                ope.addition(a, b, c);
            else if (c=='-') 
                ope.subtraction(a, b, c);
            else  if (c=='*') 
                ope.multiplication(a, b, c);
            else if (c=='/') 
                ope.division(a, b, c);
        }
        

     }
}
