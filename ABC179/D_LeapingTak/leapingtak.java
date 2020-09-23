import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var N = Integer.parseInt(str[0]);
    var K = Integer.parseInt(str[1]);

    String[] S = new String[K];

    for(var j=0;j < K;j++){
      S[j] = scan.nextLine();
    }

    System.out.println(ans);
    scan.close();
  }
}
