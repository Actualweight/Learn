package 异常;

public class Test3 {
    public static void main(String[] args) {
        try {
            int[] arr = {};
            System.out.println("最大值是："+getMax(arr));
        }catch (NullPointerException e) {
            System.out.println("数组长度为null");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组长度为0");
            e.printStackTrace();
        }
    }

    public static int getMax(int[] arr) {
        if(arr == null)
        //程序运行到throw就结束
        throw new NullPointerException();
        if(arr.length == 0)
        throw new ArrayIndexOutOfBoundsException();
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
            max = arr[i];
        }
        return max;
    }
}
