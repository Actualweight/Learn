import java.util.Scanner;

public class 输入一个日期计算从一月一日到今天一共多少天 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int er=0;
        System.out.println("请输入年：");
        int n = scanner.nextInt(); 
        System.out.println("请输入月：");
        int y = scanner.nextInt();
        System.out.println("请输入日：");
        int r = scanner.nextInt();
        if(r>=1&r<=31){
            if((n%10==0&n%100!=0)|n%400==0){
                er=29;
            }else{
                er=28;
            }
            switch(y){
                case 12:sum+=30;
                case 11:sum+=31;
                case 10:sum+=30;
                case 9:sum+=31;
                case 8:sum+=31;
                case 7:sum+=30;
                case 6:sum+=31;
                case 5:sum+=30;
                case 4:sum+=31;
                case 3:sum+=er;
                case 2:sum+=31;
                case 1:sum+=r;break;
                default:System.out.println("输入错误！");
            }  
            }else{
                System.out.println("输入日期错误");
            }
            System.out.println(n+"年"+y+"月"+r+"日"+"是本年的第"+sum+"天");
        }
    }
  
           


    

