import java.util.Scanner;

public class 输入两个整数相加 {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("输入两个整数：");
        try (Scanner in = new Scanner(System.in)) {
            x=in.nextInt();
            y=in.nextInt();
        }
        z=x+y;
        System.out.println(x+"+"+y+"="+z);
    }
}
