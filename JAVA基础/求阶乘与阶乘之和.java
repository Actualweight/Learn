import java.util.Scanner;

public class  求阶乘与阶乘之和 {
    public static void main(String[] args) {
		long jc=1,sum=0;
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		for(int i=1;i<=k;i++) {
			jc*=i;
			sum+=jc;
			System.out.println("它们的阶乘为"+jc);
		}
		System.out.println("它们的阶乘和为"+sum);
	}
}
