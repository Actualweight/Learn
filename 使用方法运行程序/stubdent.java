package 使用方法运行程序;

public class stubdent {
    private int sno;
    private String name;
    private String gender;
    private int age;
    private int javaScore;
    
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        this.sno = sno;
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
        if(gender != "男"&&gender != "女"){
            System.out.println("输入数据错误，请输入‘男’或者‘女’!");
        }else{
        this.gender = gender;}
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getJavaScore() {
        return javaScore;
    }
    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }
    public stubdent(int sno,String name,String gender,int age,int javaScore) {
        this.sno = sno;
        this.name= name;
        this.gender = gender;
        this.age = age;
        this.javaScore = javaScore;
}
public void xue(){
    System.out.println("学号是:"+sno+ "姓名是:"+name+ "性别是:"+gender+ "年龄是:"+age+ "java成绩为:"+javaScore);
}
}
