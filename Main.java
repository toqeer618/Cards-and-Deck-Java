import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Player p=new Player();
		
		 Scanner sc=new Scanner(System.in);
		 for (int i = 0; i < 100000; i++) {
//			 String opt=sc.next();
			 if(i%2==0) {
				 p.dispaly();
				 p.player1();
				 TimeUnit.SECONDS.sleep(1);
  

				 if(p.winner()==1) {
						System.out.println("Player 1 is winner");
						break;
				 }
				 
			 }
			 else {
				 p.dispaly1();
				 p.player2();
				 TimeUnit.SECONDS.sleep(1);
				 
				 if(p.winner()==2) {
						System.out.println("Player 2 is winner");
						break;

				 }
			
		}
		 }
		 
	}

}
