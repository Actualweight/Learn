package 考试;

import java.util.Scanner;

public class Tesezimu {
    public static void main(String[] args) {
        int	z=0;//统计字母
		int	x=0;//统计空格
		Scanner in = new Scanner(System.in);
		//nextLine遇到回车停止
		String s = in.nextLine();
		for(int i=0; i<s.length();i++) {
			char a = s.charAt(i);
			if(a>='A' && a<='Z' || a>='a' && a<='z')
                z++;
			else 
				x++;
           
			

	
    }
    System.out.println( "字母有"+z+"空格有"+x);
}
}
