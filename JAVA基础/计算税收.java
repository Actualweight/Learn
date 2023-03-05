import java.util.Scanner;

public class 计算税收 {
    public static void main(String[] args) {
        System.out.println("请输入纳税人类型r:0-单身，1-已婚，2-家庭");
        Scanner scanner = new Scanner(System.in);
        int r;
        double mo,tax=0;//tax为所缴纳的税率
        r = scanner.nextInt();
        System.out.println("请输入收入：");
        mo = scanner.nextDouble();
        if(r==0){
            if(mo<=6000){
                tax=mo*0.1;
            }
            else if(mo<=27950){
                tax=6000*0.1+(mo-6000)*0.15;
            }
            else if(mo<=67700){
                tax=6000*0.1+(27950-6000)*0.15+(mo-27950)*0.27;
            }
            else if(mo<=141250){
                tax=6000*0.1+(27950-6000)*0.15+(67700-27950)*0.27+(mo-67700)*0.3;
            }else{
                tax=6000*0.1+(27950-6000)*0.15+(67700-27950)*0.27+(141250-67700)*0.3+(mo-141250)*0.35;
            }
            
        }
        else if(r==1){
            if(mo<=12000){
                tax=mo*0.1;
            }
            else if(mo<=46700){
                tax=12000*0.1+(mo-12000)*0.15;
            }
            else if(mo<=112850){
                tax=12000*0.1+(46700-12000)*0.15+(mo-46700)*0.27;
            }
            else if(mo<=171950){
                tax=12000*0.1+(46700-12000)*0.15+(112850-46700)*0.27+(mo-112850)*0.3;
            }else{
                tax=12000*0.1+(46700-12000)*0.15+(112850-46700)*0.27+(171950-112850)*0.3+(mo-171950)*0.35;
            }
        }
        else if(r==2){
            if(mo<=10000){
                tax=mo*0.1;
            }
            else if(mo<=37450){
                tax=10000*0.1+(mo-10000)*0.15;
            }
            else if(mo<=96700){
                tax=10000*0.1+(37450-10000)*0.15+(mo-37450)*0.27;
            }
            else if(mo<=156600){
                tax=10000*0.1+(37450-10000)*0.15+(96700-37450)*0.27+(mo-96700)*0.3;
            }else{
                tax=10000*0.1+(37450-10000)*0.15+(96700-37450)*0.27+(156600-96700)*0.3+(mo-156600)*0.35;
            }    
        }
        else{
            System.out.println("输入错误！");
        }
        System.out.println("需要缴纳税额为："+tax);
    }
}
