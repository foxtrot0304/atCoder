import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();

    int ans = 0;

    for ( var i = 0; i < 3; i++ ){
      String s = str_scan.charAt(i);

      if ( s.equals("R")){
        ans++;
      }else{
        ans = 0;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}
