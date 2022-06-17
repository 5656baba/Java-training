import java.util.Scanner;

public class Training413 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int strike = 0;
    int ball = 0;

    while( strike < 3 && ball < 4 ){
      System.out.print( "ストライクなら0、 ボールなら1を入力" );
      int judge = Integer.parseInt( scanner.next());
      if( judge == 1 ){
        strike++;
      }else if( judge == 2 ){
        ball++;
      }
    }

      System.out.println( "ボール:," + ball + "ストライク:" + strike);
      scanner.close();
  }
}
