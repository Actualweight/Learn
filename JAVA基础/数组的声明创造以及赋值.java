public class 数组的声明创造以及赋值 {
    public static void main(String[] args) {
       // int[] m=new int[]{1,5,10};
        int[] m={1,5,10};
        for (int i=0; i<3; i++) {
            System.out.println(m[i]);
        }
        for (int i=0; i<m.length; i++){
            System.out.println(m[i]);
        }
    }
}
