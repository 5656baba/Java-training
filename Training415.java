import java.util.Scanner;

public class Training415 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt( scanner.next());
    int n;
    for( n = 2 ; n <= ( number / 2 ) ; n++ ){
      if( ( number % n ) == 0 ){
        break;
      }
    }
    if( n > ( number / 2 )){
      System.out.println( number + "は素数です" );
    }else{
      System.out.println( number + "は素数ではありません" );
    }
    scanner.close();
  }
}
