package 抽象.打仗;

public class test {
    public static void main(String[] args) {
        Weapon s = new tanke();
        s.attack();
        s.move();
        Weapon s1 = new feiji();
        s1.attack();
        s1.move();
        Weapon s2 = new WarShip();
        s2.attack();
        s2.move();
    }
}
