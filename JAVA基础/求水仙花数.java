public class 求水仙花数 {
    public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int b=i/100;
			int s=i/10%10;
			int g=i%10;
			if(Math.pow(b, 3)+Math.pow(s, 3)+Math.pow(g, 3)==i)
				System.out.println("1000以内的水仙花数为"+i);
				
		}

	}

}
