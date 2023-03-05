import java.util.Scanner;

public class switch判断成绩 {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩：");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>0&x<=100){
            switch (x/10) {
                case 10:System.out.println("满分");break;
                case 9:System.out.println("优秀");break;
                case 8:System.out.println("良好");break;
                case 7:System.out.println("中等");break;
                case 6:System.out.println("及格");break;
                default:System.out.println("不及格");
            }
        }
        else{
            System.out.println("输入成绩错误！");
        }
    }
}
