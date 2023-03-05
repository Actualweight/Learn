import java.util.Scanner;

public class 使用数组输出斐波那契数列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a=new long[n];
        a[0]=1;
        a[1]=1;
        for (int i=2; i<a.length; i++) {
            a[i]=a[i-1]+a[i-2];
        }
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]+" ");
        }

    }
}
