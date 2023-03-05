import java.util.Scanner;

public class 求某个月的天数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numr=0;
        System.out.println("请输入年：");
        int n = scanner.nextInt();
        
        System.out.println("请输入月：");
        int y = scanner.nextInt();
        switch(y){
            case 2:if((n%4==0&n%100!=0)|n%400==0){numr=29;
            }else{numr=28;}
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:numr=31;break;
            case 4:
            case 6:
            case 9:
            case 11:numr=30;break;
        }
        System.out.println(n+"年"+y+"月"+"有"+numr+"天");
    }
}
