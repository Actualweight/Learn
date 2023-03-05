import java.util.Scanner;

public class 求出圆的面积{
    public static double mianji(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        System.out.println("请输入圆的半径");
        Scanner in = new Scanner(System.in);
        int r=in.nextInt();
        System.out.println("圆的面积为"+mianji(r));
    }
}