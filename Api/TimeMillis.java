package Api;

public class TimeMillis {
    public static void main(String[] args) {
        double star=System.currentTimeMillis();
		double s = 1;
		for(int i=0;i<10000;i++) {
			s+=(double)(Math.random()*10);
		}
		System.out.println(s);
		double e=System.currentTimeMillis()-star;
		System.out.println("程序运行时间为："+e+"秒");
    }
}
