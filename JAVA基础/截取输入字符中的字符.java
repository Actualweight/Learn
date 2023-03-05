import java.util.Scanner;

public class 截取输入字符中的字符 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("被截取的字符为："+s.substring(3, 5));
    }
}
