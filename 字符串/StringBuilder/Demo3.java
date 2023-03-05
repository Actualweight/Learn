package 字符串.StringBuilder;

import java.util.StringJoiner;

public class Demo3 {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbbb", "cccc", "ddd"};
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < str.length;i++) {
            sj.add(str[i]);
        }
        System.out.println(sj.toString());
    }
}
