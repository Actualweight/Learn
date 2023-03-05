package 拓展.Compare;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Person p  = new Person("tom",18,1.9);
        Person p1 = new Person("tom1",19,1.78);
        Person p2 = new Person("tom2",17,1.85);
        Person p3 = new Person("tom3",19,1.7);
        Person p4 = new Person("tom4",28,1.8);

        Person[] persons = {p,p1,p2,p3,p4};
;
        //排序
        Arrays.sort(persons);
        //打印
        for(Person per:persons){
            System.out.println(per.getName()+","+per.getAge()+","+per.getShengao());
    }
}
}
