import java.util.Scanner;

public class 生产成本计算问题 {
    public static void main(String[] args) {
        System.out.println("请输入产品数量：");
       Scanner input = new Scanner(System.in) ;
            int m = input.nextInt();
            int c1,c2,c=0;
            if(m<10000)
            {
                c1=20000;
                c2=10;
                c=c1+(m*c2);
            }
            else if(m>10000)
            {
                c1=40000;
                c2=5;
                c=c1+(m*c2);
            }
            
            System.out.println("总成本为："+c);
        }
        
    }

