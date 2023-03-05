import java.util.Scanner;

public class 取出一个整数中的每一位数 {
    public static void main(String[] args) {
        System.out.println("请输入一个四位整数：");
        try (Scanner in = new Scanner(System.in)){
        int num = in.nextInt();
        int q,b,s,g;
        q=num/1000;
        b=num/100%10;
        s=num/10%10;
        g=num%10;
        System.out.println(q+" "+b+" "+s+" "+g);
    }
}
}