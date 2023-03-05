import java.util.Scanner;

public class 输入三条边求出三角形的面积 {//三角形的面积公式为P=(a+b+c)/2(除以2.0用来避免精度损失)海伦公式
    public static void main(String[] args) {
        System.out.println("请输入三角形的三条边：");
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            double p=(a+b+c)/2.0;
            double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//三角形的任意两边之和大于第三边
            if((b+c)>a&(a+c)>b&(a+b)>c){
                System.out.println(s);
            }else{
                System.out.println("输入数据错误");
            }
        }
    }
}
