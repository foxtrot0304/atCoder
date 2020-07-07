import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    var ans = 0;

    var num = str_scan.split(" ");

    var H = Integer.parseInt(num[0]); 
    var W = Integer.parseInt(num[1]); 
    var K = Integer.parseInt(num[2]); 

    String[] str2_scan = new String[H];
    String[][] str = new String[H][W];

    for (var i = 0; i < H; i++) {
      str2_scan[i] = scan.nextLine();
      for (var j = 0; j < W; j++) {
        str[i][j] = String.valueOf(str2_scan[i].charAt(j));
      }
    }

    for (var row = 0; row < (1 << H); row++) {
      for(var line = 0; line < (1 << W); line++) {
	var black_cnt = 0;
	//右シフトしつつ、1のけたが0かどうかを確認
	for (var m = 0; m < H; m++){
	  for (var n = 0; n < W; n++){
	    if (((row >> m) & 1) == 0  && ((line >> n) & 1) == 0 ){
              if (str[m][n].equals('#')) {
	        black_cnt++;
	      }
	    }
	  }
	}
	if (black_cnt == K) {
	  ans++;
	}
      }
    }

    System.out.println(ans);
    scan.close();
  }
}
