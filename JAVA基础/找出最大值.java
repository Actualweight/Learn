import java.util.Scanner;

public class 找出最大值 {
    public static void main(String[] args) {
        System.out.println("请输入三个值：");
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max=a;
            if(max<b)
            {
                max=b;
            }
            if(max<c)
            {
                max=c;
            }
            System.out.println("最大值为："+max);
    }
}
}
