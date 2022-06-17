import java.util.Scanner;


public class Training408 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    for (int i = 0; i < 10;i++){
      int number = Integer.parseInt( scanner.next());

    if( number > max )
        max = number;
    }
    System.out.println("最大値：" + max);
    scanner.close();
  }
}
