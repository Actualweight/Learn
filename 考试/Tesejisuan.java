package 考试;

class Circle { 
    private double radius; 
    Circle() { 
    radius=0.0;
    }
    Circle(double r) { 
    radius=r;
    }
    double getPerimeter() { 
    return 2*Math.PI*radius;
    }
    double getArea() { 
    return Math.PI*radius*radius;
    }
    void disp() { 
    System.out.println("圆半径="+radius);
    System.out.println("圆周长="+getPerimeter());
    System.out.println("圆面积="+getArea());
    }
    }
    class Cylinder extends Circle {
    private double hight; 
    Cylinder(double r,double h) { 
    super(r);
    hight=h;
    }
    public double getVol() { 
    return getArea()*hight;
    }
    public void dispVol() { 
    System.out.println("圆柱体积="+getVol());
    }
    }
    public class Tesejisuan { 
    public static void main(String[] args) {
    Circle Ci=new Circle(20.0); 
    Ci.disp(); 
    Cylinder Cyl=new Cylinder(15.0,30.0); 
    Cyl.disp(); 
    Cyl.dispVol(); 
    }
    }
