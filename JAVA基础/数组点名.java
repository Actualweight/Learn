public class 数组点名 {
    public static void main(String[] args) {
        String name[] = {"石杰","王昭","熊浩","王晨","李琪"};
        for (int i = 0; i < name.length;i++) {
            System.out.println(name[i]+" ");
        }
        System.out.println();
        System.out.println(name[(int)(Math.random()*5)]);
    }
}
