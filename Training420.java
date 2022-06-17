import java.util.Scanner;

public class Training420 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt( scanner.next());
    for( int i = 0 ; i < size ; i++ ){
      for( int x = 0 ; x <= i ; x++ ){
        System.out.print( "*" );
      }
      System.out.println("");
    }
    scanner.close();
  }
}
