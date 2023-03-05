import java.util.Scanner;

public class 输入三个数求最大值 {
    public static void main(String[] args) {
        System.out.println("请输入三个整数：");
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a>b&a>c)
            {
                System.out.println("最大值为："+a);
            }
            else if(b>a&b>c)
            {
                System.out.println("最大值为："+b);
            }
            else
            {
                System.out.println("最大值为："+c);
            }
        }
    }
}
