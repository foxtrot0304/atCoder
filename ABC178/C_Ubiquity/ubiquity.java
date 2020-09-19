import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    int N = Integer.parseInt(str_scan);
    long ans = 0;
    long anstmp = 0;
    long MOD = 1000000007;

    if (N == 1){
      ans = 0;
    }else {
      for(var i = 0;i < N-1;i++){
        for(var j = 0;j < N-i;j++){
          ans += Math.pow(8,N-i-j);
          ans %= MOD;
        }
      }
    }

    System.out.println(ans);
    scan.close();
  }
}
