public class 找出随机数的因子 {
    public static void main(String[] args) {
		int num=(int)(Math.random()*300);
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				System.out.println("随机数为"+num);
				System.out.println(i+"是num的因数");
		}

	}

}
