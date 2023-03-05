package 使用方法运行程序;

import java.util.Scanner;

public class 使用方法运行斐波那契数列 {
    public static void a(int n){
        long[] a = new long[n];
        a[0] =1;
        a[1] =1;
        for(int i=2;i<a.length;i++){
            a[i]=a[i-1]+a[i-2];
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("请输入数列的项数：");
        try (Scanner input = new Scanner(System.in)) {
            int f = input.nextInt();
            a(f);
        }
    }
}
