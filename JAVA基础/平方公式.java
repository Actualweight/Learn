import java.util.Scanner;

public class 平方公式 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数a,b,c:");
        try (Scanner in = new Scanner(System.in)) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            double x1,x2;
            x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
            x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
       
    }
}
