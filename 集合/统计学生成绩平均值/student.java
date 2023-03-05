package 集合.统计学生成绩平均值;


public class student {
    private String name;
    private int cj;
    public student(String name, int cj) {
        this.name = name;
        this.cj = cj;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCj() {
        return cj;
    }
    public void setCj(int cj) {
        this.cj = cj;
    }
}
