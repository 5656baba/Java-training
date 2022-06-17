import java.util.Scanner;

public class Training418 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while (true){
      int number = Integer.parseInt( scanner.next());
      if(number == 0){
        break;
      }
      sum += number;
    }
    System.out.println(sum);
    scanner.close();
  }
}
