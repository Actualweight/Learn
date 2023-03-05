package 抽象.动物行为;

public class sheep extends Animal {

	public sheep(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+"吃草");
		
	}

	
}
