import java.util.Scanner;
//求球体的体积和面积
public class 求球的体积和面积 {
    public static void main(String[] args) {
        System.out.println("请输入球的半径：");
        try (Scanner in = new Scanner(System.in)) {
            double r=in.nextDouble();
            double v,v1;
            v=4/3*Math.PI*Math.pow(r, 3);/*此处有整数4，4/3有误差*/
            v1=(4.0*Math.PI*Math.pow(r,3))/3;
            System.out.println(v);
            System.out.println(v1);
        }


    }
}
