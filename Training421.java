import java.util.Scanner;

public class Training421 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt( scanner.next());
    for( int i = 0 ; i < size ; i++ ){
      for( int x = 0 ; x <= size ; x++ ){
        if( i == x || ( size - i - 1 ) == x ){
          System.out.print( "X" );
        }else{
          System.out.print( " " );
        }
      }
      System.out.println("");
    }
    scanner.close();
  }
}
