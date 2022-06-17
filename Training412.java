import java.util.Scanner;

public class Training412 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while(sum < 100){
      sum += Integer.parseInt(scanner.next());
    }
    System.out.println(sum);
    scanner.close();
  }
}
