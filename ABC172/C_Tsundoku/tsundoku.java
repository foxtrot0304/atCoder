import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String book_and_time_input = scan.nextLine();
    String deskA_input = scan.nextLine();
    String deskB_input = scan.nextLine();

    var book_and_time = book_and_time_input.split(" ");
    var deskA = deskA_input.split(" ");
    var deskB = deskB_input.split(" ");
    int num_of_deskA_books = Integer.parseInt(book_and_time[0]);
    int num_of_deskB_books = Integer.parseInt(book_and_time[1]);
    int time_to_read = Integer.parseInt(book_and_time[2]);

    for (var i = 0;i < num_of_deskA_books;i++) {
	    for (var j = 0; j < num_of_deskB_books;j++) {
		    // ここでtime_to_readの判定をする
		    if (Integer.parseInt(deskA_input[i]) <= Integer.parseInt(deskB_input[j]) {
			   // 少ない方をtime_to_readからマイナスする 
		    }else {
		    }
	    }
    }

    System.out.println(book_and_time[1]);
    System.out.println(deskA[1]);
    System.out.println(deskB[1]);
    scan.close();
  }
}
