public class 计算100以内的奇数与偶数之和 {
    public static void main(String[] args) {
		int sum1=0,sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum2+=i;
			}else {
				sum1+=i;
			}
		}
		System.out.println("偶数之和是"+sum2);
		System.out.println("奇数之和是"+sum1);
	}
}
