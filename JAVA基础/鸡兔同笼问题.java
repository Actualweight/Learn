import java.util.Scanner;

public class 鸡兔同笼问题 {
    public static void main(String[] args) {
		System.out.println("请输入头和脚的数目");
		try (Scanner in = new Scanner(System.in)) {
			int t=in.nextInt();
			int j=in.nextInt();
			for(int i=0;i<=j;i++) {
				for(int k=0;k<=j;k++) {
					if(i+k==t&i*2+k*4==j)
						System.out.println("鸡有"+i+"只"+"兔有"+k+"只");
				}
			}
		}

	}
}
