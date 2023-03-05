import java.util.Scanner;

public class 有序数列 {
    public static void main(String[] args) {
    int x = 2;		
    int y = 1;		
    int t = 0;
    double sum = 0;
    Scanner input = new Scanner(System.in);
    int a=input.nextInt();
    for(int i = 1;i<=a;i++) {	
        sum += (double)x/y;
        t = y;
        y = x;		
        x = y+t;	
    }
    System.out.println("前"+a+"项之和为："+sum);
        }
    }
