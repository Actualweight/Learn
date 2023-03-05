package 字符串.StringBuilder;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串A：");
        String s1 = scanner.next();
        System.out.println("请输入字符串B：");
        String s2 = scanner.next();
        StringBuilder sb = new StringBuilder(s1);
        boolean flag = false;
        for (int i = 0; i <s1.length(); i++) {
            //记录第一个字符
           char c = sb.charAt(0);
            //删除字符再添加到末尾
            sb.deleteCharAt(0);
            sb.append(c);
            //对比
            if(s2.equals(sb.toString())) {
                System.out.println(true);
                flag=true;
                break;
            }
            }
        if(!flag)
        System.out.println(false);
        }
       
    }

