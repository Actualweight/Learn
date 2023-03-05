package 抽象.动物行为;

public class Test {
public static void main(String[] args) {
	Animal a = new frog("青蛙",12);
	Animal a1 = new dog("狗",12);
	Animal a2 = new sheep("羊",12);
	a.eat();
	a.drink();
	
	a1.eat();
	a1.drink();
	
	a2.eat();
	a2.drink();
}
}
