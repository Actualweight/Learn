import java.util.Scanner;

public class 打印等腰三角 {
    public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
        int k = scanner.nextInt();
          for (int i = 1; i <=k ; i++) {
            for(int g=1; g <=k-i; g++) {
              System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      } 
     
}
}

