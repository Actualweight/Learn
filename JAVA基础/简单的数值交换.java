public class 简单的数值交换 {
    public static void main(String[] args) {
        System.out.println("成绩交换前为：");
        int i=90,j=80,k;
        System.out.println("语文成绩："+i);
        System.out.println("数学成绩："+j);
        k=i;//将i的初始值赋给k
        i=j;//将j的初始值赋给i
        j=k;//j再取k的值
        System.out.println("成绩交换后为：");
        System.out.println("语文成绩："+i);
        System.out.println("数学成绩："+j);
    }
}
