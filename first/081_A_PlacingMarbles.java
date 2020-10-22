import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();

    int ans = 0;

    char[] c = str_scan.toCharArray();

    for(char c1 : c){
      if(c1 == '1'){
        ans++;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}
