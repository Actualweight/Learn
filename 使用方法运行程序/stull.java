package 使用方法运行程序;

public class stull {
    public static void main(String[] args) {
        stubdent s1 = new stubdent(123,"韩枫","男",19,99);
        s1.xue();
        System.out.println("\n");
        stubdent s2 = new stubdent(123,"顾楠","女",2000,100);
        s2.xue();
        System.out.println("\n");
        stubdent s3 = new stubdent(123,"老二","女",99,10);
        s3.xue();
        System.out.println("\n");
        stubdent s4 = new stubdent(123,"张晓伞","男",19,29);
        s4.xue();
        System.out.println("\n");
        stubdent s5 = new stubdent(123,"萧炎","男",13,98);
        s5.xue();
        System.out.println("\n");
        int ss[] ={99,100,10,29,98};
        
        int m1=Max(ss);
        int m2=Min(ss);
        int A1=Avg(ss);
        System.out.println("最大值是:"+m1);
        System.out.println("最小值是:"+m2);
        System.out.println("平均值是:"+A1);
    }
    public static int Max(int ss[]) {
        int max=ss[0];
    for(int i=1;i<ss.length;i++){
        if(ss[i]>max){
            max=ss[i];
        }
    }
     return max;
    }
    public static int Min(int ss[]) {
        int min=ss[0];
    for(int i=1;i<ss.length;i++){
        if(ss[i]<min){
            min=ss[i];
        }
    }
     return min;
    }
    public static int Avg(int ss[]) {
        int sum = 0,avg=0;
    for(int i=1;i<ss.length;i++){
        sum+=ss[i];
    }
    avg=sum/ss.length;
    return avg;
    }
}

