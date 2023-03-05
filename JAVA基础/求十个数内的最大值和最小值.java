import java.util.Scanner;

public class 求十个数内的最大值和最小值 {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您所需要的数据个数：");
		int z=in.nextInt();
		int max=0,min=1;
		System.out.println("请输入您的数据：");
		for(int i=1;i<=z;i++) {
			System.out.println("请输入您的第"+i+"个数据：");
			int n=in.nextInt();
			if(n>max)
				max=n;
			if(n<min)
				min=n;
		}
		System.out.println(z+"个数值里最大值"+max);
		System.out.println(z+"个数值里最小值"+min);
	}
}
