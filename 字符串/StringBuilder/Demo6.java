package 字符串.StringBuilder;
import java.util.Random;
import java.util.Scanner;
//产生验证码
//（1）长度为5，其中四位字母，1位数字，大小写不限，数字可以出现在任何位置
public class Demo6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a' && c<='z') {
                int index = c-97;
                count[index]++;
            }
        }
        //寻找最大值
        int max = count[0];
        int maxIndex = 0;
        for(int i=0;i<count.length;i++){
            if (max<count[i]) {
                max=count[i];
                maxIndex = i;
            }
        }
        System.out.println(max+" "+(char)(maxIndex+97)+" "+max);
    }
}
