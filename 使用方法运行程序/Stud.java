package 使用方法运行程序;

public class Stud {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        System.out.println("姓名是："+stu.getName());
        stu.setAge(20);
        System.out.println("年龄是:"+stu.getAge());
        stu.setGender("男");
        System.out.println("性别是："+stu.getGender()); 
        stu.setAddress("武汉");
        System.out.println("居住地址是："+stu.getAddress());    
    }
}