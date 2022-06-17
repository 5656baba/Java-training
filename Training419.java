import java.util.Scanner;

public class Training419 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    while (true){
      int number = Integer.parseInt( scanner.next());
      if(number == 0){
        break;
      }
      sum += number;
      count ++;
    }
    System.out.println(sum/count);
    scanner.close();
  }
}
