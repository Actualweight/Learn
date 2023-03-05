import java.util.Scanner;
public class 分割字符 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String s=input.nextLine();
            String a[]=s.split("k");
            for (int i=0; i<a.length; i++) {
               System.out.println(a[i]);
            }
        }
    }
}
