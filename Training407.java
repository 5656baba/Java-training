import java.util.Scanner;

public class Training407 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int giants = 0;
    int tigers = 0;

    for( int i = 1 ; i <= 9 ; i++ ){
      System.out.print( i + "回表、巨人の得点は？" );
      giants += Integer.parseInt( scanner.next());

      System.out.print( i + "回裏、阪神の得点は？" );
      tigers += Integer.parseInt( scanner.next());
    }

    System.out.println( "巨人：" + giants + "点, 阪神：" + tigers + "点" );

    if( giants > tigers )
      System.out.println( "巨人の勝ち" );
    else if( giants < tigers )
      System.out.println( "阪神の勝ち" );
    else
    System.out.println( "引き分け" );
    scanner.close();
  }
}
