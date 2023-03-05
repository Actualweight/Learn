package 抽象.动物行为;

public class frog extends Animal {

	public frog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println(getName()+"吃虫子");
		
	}

	
}
