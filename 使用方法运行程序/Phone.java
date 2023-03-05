package 使用方法运行程序;

public class Phone{
 private String brand;
 private double price;
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public Phone(String brand, double price) {
    this.brand = brand;
    this.price = price;
}
public void call() {
    System.out.println("正在使用价格为"+price+"元的"+brand+"手机打电话");
}
public void ca() {
    System.out.println("正在使用价格为"+price+"元的"+brand+"手机发短信");
}
public void c() {
    System.out.println("正在使用价格为"+price+"元的"+brand+"手机玩游戏");
}
public static void main(String[] args) {
    Phone p1 = new Phone("小米9",2398);
    Phone p2 = new Phone("小米8",1598);
    Phone p3 = new Phone("红米",998);
    p1.call();
    p2.ca();
    p3.c();
}
}
