import java.util.Scanner;

public class 输入星期几判断是工作日还是休息日 {
    public static void main(String[] args) {
        System.out.println("输入今天是周几：");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("工作日");break;
            case 6:
            case 7:System.out.println("休息日");break;
            default:System.out.println("请输入数字1-7");break;
        }
    }
}
