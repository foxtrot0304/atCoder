import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var X = Long.parseLong(str[0]);
    var K = Long.parseLong(str[1]);
    var D = Long.parseLong(str[2]);

    long ans = 0;

    if ( X < 0 ){
      X = X * -1;
    }

    for (var i=0;i < K;i++){
      if ( X > 0 ) {
        X = X - D;
      } else {
        X = X + D;
      }
    }

    if (X < 0) {
      ans = -1 * X;
    } else {
      ans = X;
    }

    System.out.println(ans);
    scan.close();
  }
}
