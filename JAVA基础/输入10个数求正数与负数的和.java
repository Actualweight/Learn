import java.util.Scanner;

public class 输入10个数求正数与负数的和 {
    public static void main(String[] args) {
		int sum=0,sum1=0;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			int n=in.nextInt();
			if(n>0)
				sum+=n;
			else
				sum1+=n;
		}
		System.out.println("负数和为"+sum1);
		System.out.println("正数和为"+sum);
	}

}
