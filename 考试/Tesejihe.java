package 考试;

import java.util.ArrayList;

public class Tesejihe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (list.size()<50){
            int login=(int)(Math.random()*50);
            list.add(login);
        }
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--) {
            if(list.get(i).intValue()>=10){
                list.remove(i);
            }
            

        }
        System.out.println("删除后的数据为："+list);

}
}