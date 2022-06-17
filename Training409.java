import java.util.Scanner;

public class Training409 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int min = 0;
    for (int i = 0; i < 10; i++){
      int number = Integer.parseInt( scanner.next());

      if( i == 0 ){
        max = number;
        min = number;
      }else{
        if( number > max ){
          max = number;
        }
        if( number < min ){
          min = number;
        }
      }
    }
    System.out.println("最大値：" + max + "最小値：" + min);
    scanner.close();
  }
}
