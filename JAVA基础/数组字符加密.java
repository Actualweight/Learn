import java.util.Scanner;

public class 数组字符加密 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c=input.nextLine();
        for (int i=0; i<c.length(); i++) {
            if (c.charAt(i) == 'x')
            {
                System.out.println('a');
            }else if (c.charAt(i) == 'y')
            {
                System.out.println('b');
            }else if (c.charAt(i) == 'Y')
            {
                System.out.println('B');
            }else if (c.charAt(i) == 'z')
            {
                System.out.println('c');
            }else if (c.charAt(i) == 'Z')
            {
                System.out.println('C');
            }else{
                System.out.println((char)(c.charAt(i)+3));
            }
        }
    }
}
