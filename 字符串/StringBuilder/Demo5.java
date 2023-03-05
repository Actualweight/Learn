package 字符串.StringBuilder;
import java.util.Random;
import java.util.Scanner;
//产生验证码
//（1）长度为5，其中四位字母，1位数字，大小写不限，数字可以出现在任何位置
public class Demo5 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f","g", "h", "i", "j", "k", "l","m", "n", "o", "p", "q", "r","s", "t", "u", "v", "w", "x","y", "z", 
        "A", "B", "C", "D", "E", "F","G", "H", "I", "J", "K", "L","M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X","Y", "Z"};
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        //四位字母
        for (int i = 0; i < 4; i++) {
            String ra = str[rand.nextInt(str.length)];
            sb.append(ra);
        }
        System.out.println(sb);
        //产生0-9随机数
        int ranNum = rand.nextInt(10);
        //产生随机位置 0 1 2 3 4
        int randIndex = rand.nextInt(5);
        sb.insert(randIndex, ranNum);
        System.out.println(sb.toString());
    }
}
