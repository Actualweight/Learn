import java.util.Scanner;

public class 数组比大小 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = new int[10];
        int max=0,min=0;
        for(int i=0;i<a.length;i++) {
            a[i] = input.nextInt();
            min=a[0];
            if(a[i]>max){
                max = a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
