import java.util.Scanner;

public class Training411 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int count = Integer.parseInt(scanner.next());
    for (int i = 0; i < count; i++){
      for (int x = 0; x < 10; x++){
        System.out.println(x);
      }
    }
    scanner.close();
  }
}
