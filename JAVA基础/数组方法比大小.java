import java.util.Arrays;
import java.util.Scanner;

public class 数组方法比大小 {
    public static void main(String[] args) {
        System.out.println("请输入十个整数：");
        Scanner input = new Scanner(System.in);
        int a[]=new int[10];
        for (int i=0; i<a.length; i++){
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);
    }
}
