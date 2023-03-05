import java.util.Scanner;
//求一个矩形的周长
public class 求矩形的周长和面积 {
    public static void main(String[] args) {
        System.out.println("请输入矩形的宽和高：");
        try (Scanner in = new Scanner(System.in)) {
            double w=in.nextDouble();
            double h=in.nextDouble();
            double r=w*h;
            double p=(w+h)*2;
            System.out.println("矩形的周长为："+p);
            System.out.println("矩形的面积为："+r);
        }


    }
}
