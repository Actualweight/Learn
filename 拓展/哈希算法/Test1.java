package 拓展.哈希算法;

import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("zs", 12, "男");
        Student s2 = new Student("ls", 13, "女");
        Student s3 = new Student("ws", 20, "男");
        Student s4 = new Student("ms", 20, "女");
         //     ArrayList<Student> list = new ArrayList<Student>();
    //     list.add(s1);
    //     if (!s1.equals(s2)) {
    //         list.add(s2);

    //     }
        // for (Student s : list) {
        //     System.out.println(s.getName() + " " + s.getAge() + " " + s.getSex());

        // }
    // 

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        //打印
        for(Student s : set){
            System.out.println(s.getName() + " ," + s.getAge()+" " + s.getSex());

        }

    }

    }




   
