package 异常;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //try里面写有可能出错的代码
        //catch里面进行异常的捕获，注意catch可以包含多个，注意是从小到大
        //try-catch可以进行捕捉异常，并且程序继续运行不会停止
        try{
            String s = "abc";
            System.out.println(s.charAt(0));
            Scanner in = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int num = in.nextInt();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("算数异常");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("看看我执行了没有？");
    }
}
