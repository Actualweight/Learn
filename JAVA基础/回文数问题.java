public class 回文数问题 {
    public static void main(String[] args) {
		int a,b,c,d,e;
		int sum=0;
		for(int i=10000;i<=100000;i++) {
			a=i/10000;
			b=i/1000%10;
			c=i/100%10;
			d=i/10%10;
			e=i%10;
			if(a==e&b==d) {
				System.out.println(i);
				sum++;	
			}	
		}
		System.out.println("十万以内的回文数一共有："+sum+"个");
	}
}
