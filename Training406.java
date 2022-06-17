import java.util.Scanner;

public class Training406 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int win = 0;
    System.out.println("数字を入力してください");
    for (int i = 0; i < 10; i++){
      int numbers = Integer.parseInt( scanner.next());
      if (numbers == 1){
        win += 1;
      }
    }
    System.out.println( "勝ち" + win + "回、負け" + ( 10 - win ) + "回" );
    scanner.close();
  }
}
