public class 互不相同的三位数 {
    public static void main(String[] args) {
        for(int b=1;b<=4;b++) {
            for(int s=1;s<=4;s++) {
                for(int c=1;c<=4;c++) {
                    if(b!=s&s!=c&b!=c) {
                        System.out.println(b*100+s*10+c);
                    }
                }
            }
        }
    }
}
