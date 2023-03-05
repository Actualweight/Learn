package 拓展.Compare;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double shengao;
    public Person(String name, int age, double shengao) {
        this.name = name;
        this.age = age;
        this.shengao = shengao;
    }
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
    public double getShengao() {
        return shengao;
    }
    public void setShengao(double shengao) {
        this.shengao = shengao;
    }
    @Override
    public int compareTo(Person other) {
        double result =this.age - other.age;
        if(result == 0){
            result = this.shengao - other.shengao;  
        }
        if (result == 0){
            result = this.name.compareTo(other.name);

        }
        if(result>0)
        return 1;
        else if(result<0)
        return -1;
        else
        return 0;
}
}
