import java.util.Scanner;
public class if成绩分段 {
    public static void main(String[] args) {
        System.out.println("请输入一个成绩：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>=90&num<=100)
        {
            System.out.println("优秀");
        }
        else if(num>=80)
        {
            System.out.println("良好");
        }
        else if(num>=70)
        {
            System.out.println("中等");
        }
        else if(num>=60)
        {
            System.out.println("及格");
        }
        else
        {
            System.out.println("不及格");
        }
    }
}
