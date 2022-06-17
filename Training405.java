import java.util.Scanner;

public class Training405 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("数字を入力してください");
    int sum = 0;
    for (int i = 0; i < 10; i++){
      int numbers = Integer.parseInt( scanner.next());
      sum += numbers;
    }
    System.out.println("平均:" + sum/10);
    scanner.close();
  }
}
