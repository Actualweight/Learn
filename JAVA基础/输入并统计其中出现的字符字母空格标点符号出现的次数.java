import java.util.Scanner;
public class 输入并统计其中出现的字符字母空格标点符号出现的次数 {
    public static void main(String[] args) {
        int z=0,j=0,k=0,q=0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char c[]=a.toCharArray();
        for (int i=0; i<c.length; i++) {
            if(Character.isLetter(c[i])){
                z++;
            }else if(Character.isSpace(c[i])){
                j++;
            }else if(Character.isDigit(c[i])){
                k++;
            }else{
                q++;
            }
        }
        System.out.println("字母有："+z);
        System.out.println("空格有："+j);
        System.out.println("数字有："+k);
        System.out.println("其他："+q);
    }
}
