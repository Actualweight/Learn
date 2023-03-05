package 使用方法运行程序;

public class Student {
 private int age;
 private String name;
 private String gender;
 private String address;
public int getAge() {
    return age;
}
public void setAge(int age) {
    if(age <0||age>100){
        this.age =19;
    }else{
    this.age = age;
}
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
 
}