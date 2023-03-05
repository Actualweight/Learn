import java.util.Scanner;
public class 根据周几判断今日的菜 {
    public static void main(String[] args) {
        System.out.println("输入今天是周几：");
        try (Scanner scanner = new Scanner(System.in)) {
            int day = scanner.nextInt();
            switch (day){
                case 1:System.out.println("红烧牛肉");break;
                case 2:System.out.println("辣子鸡丁");break;
                case 3:System.out.println("回锅肉");break;
                case 4:System.out.println("鱼香肉丝");break;
                case 5:System.out.println("干锅排骨");break;
            }
        }
    }
}
