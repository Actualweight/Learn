package 抽象.动物行为;


public abstract class Animal {
	//属性:名字、年龄
	private String name;
	private int age;
	
    //喝水
	public void drink() {
		System.out.println(name+"喝水");
	}
	//吃东西,因为每个动物吃的东西不一样，所以要定义抽象类
	public abstract void eat();
	//自动产生gat、set、和构造方法
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}