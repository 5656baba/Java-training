import java.util.Scanner;

public class Training416 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt( scanner.next());
    for( int x = 2 ; number > 1 ; x++ ){
      while( ( number % x ) == 0 ){
        System.out.print( x + " " );
        number /= x;
      }
    }
    scanner.close();
  }
}
