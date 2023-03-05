import java.util.Scanner;

public class 秒数转化为分钟和小时 {
    public static void main(String[] args) {            
        System.out.println("请输入时间：");         
        try (Scanner in = new Scanner(System.in)){          /*文档扫描器，接收键盘输入/*从键盘输入一个变量*/
            int i=in.nextInt();                               
            int h,m,s;
            h=i/3600;                                          
            m=i%3600/60;
            s=i%3600%60;
            System.out.println(h+"小时"+m+"分钟"+s+"秒");
        }
    }
}
