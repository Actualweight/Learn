package 字符串.StringBuilder;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.println("请输入字符串：");
            s = sc.next();
            boolean flag = ch(s);
            if(flag){
                break;
            }else{
                System.out.println("字符串错误");
                continue;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char m = s.charAt(i);
            int num = m - 48;
            String get = c(num);
            str.append(get);
        }
        System.out.println(str);
    }
    public static String c(int num) {
        String[] a = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return a[num];
    }                                                    
    public static boolean ch(String s) {
        if(s.length()>9){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char m = s.charAt(i);
            if(m<'0'||m>'9'){
                return false;
            }
        }
        return true;
    }
}
