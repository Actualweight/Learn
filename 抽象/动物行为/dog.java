package 抽象.动物行为;

public class dog extends Animal {
    public dog(String name, int age){
        super(name, age);
    }
    @Override
    public void eat(){
        System.out.println(getName() + "吃骨头");
    }
    
    
}
