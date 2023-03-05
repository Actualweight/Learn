package 使用方法运行程序;
import java.util.Scanner;
public class Box {
    private double len;
    private double w;
    private double h;
    public double getLen() {
        return len;
    }
    public void setLen(double len) {
        this.len = len;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
   
    public  Box(double len, double w, double h) {
        this.len = len;
        this.w = w;
        this.h = h;
    }
    public double v(){
        return len*w*h;
    }
    public double s(){
        return (len*w+w*h+len*h)*2;
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("请输入长宽高：");
            double len = in.nextDouble();
            double w = in.nextDouble();
            double h = in.nextDouble();
            Box box = new Box(len,w,h);
            System.out.println("立方体的体积为："+box.v());
            System.out.println("立方体表面积为："+box.s());
        }
    }

}
