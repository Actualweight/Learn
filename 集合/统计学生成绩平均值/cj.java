package 集合.统计学生成绩平均值;

import java.util.*;

public class cj {
    public static void main(String[] args) {
      ArrayList<student> list = new ArrayList<>();
      student s1 = new student("张1",99);
      student s2 = new student("张2",60);
      student s3 = new student("张3", 45);
      student s4 = new student("王1", 99);
      student s5 = new student("李7", 100);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        double num=0;
       System.out.println(num=(s1.getCj()+s2.getCj()+s3.getCj())/3);
    }
}
