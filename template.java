import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var ans = Integer.parseInt(str_scan);

    System.out.println(ans);
    scan.close();
  }
}
