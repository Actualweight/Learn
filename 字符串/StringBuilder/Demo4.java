package 字符串.StringBuilder;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        //每个元素都和任意一个元素位置交换
        Random rand = new Random();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int index = rand.nextInt(c.length);
            char t =c[i];
            c[i] = c[index];
            c[index] = t;
        }
        s = new String(c);
        System.out.println(s);
    }
}
