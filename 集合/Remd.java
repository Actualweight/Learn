package 集合;

import java.util.*;

public class Remd {
    public static void main(String[] args){
        Random r = new Random();
        HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<10){
            int a = r.nextInt(20);
            if(a>=1)
            set.add(a);
        }
        Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer s = it.next();
			System.out.print(s+" ");
		}
       
    }
}
