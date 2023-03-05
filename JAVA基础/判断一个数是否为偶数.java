import java.util.Scanner;
public class 判断一个数是否为偶数 {
    public static void main(String[] args) {
        System.out.println("请输入一个数:");
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
           if(num%2==0){
               System.out.println(num+"是偶数");
           }
           else{
               System.out.println(num+"不是偶数");
           }
        }
    }
}
