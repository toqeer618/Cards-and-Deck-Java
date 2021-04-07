import java.util.Iterator;
import java.util.Random;

public class Deck {
	private Cards card[];
	
	public Deck() {
		card=new Cards[52];
		Build();
	}
	
	public void Build() {
		String suits[]= {"Hearts","Spades","Diamonds","Clubs"};
		int j=0;
		for (String st: suits) {
			for (int i = 1; i < 14; i++) {
				card[j]=new Cards(st,i);
				j++;
			}	
		
		}	
	}
	
	public void shuffle() {
		Random R=new Random();
		for (int i = 0; i < card.length; i++) {
			int r=R.nextInt(i+1);
			Cards c=card[i];
			card[i]=card[r];
			card[r]=c;
		}
	}
	public void display() {
		for (Cards c: card) {
			System.out.println(c.suit+ " of "+ c.val);
		}
	}
	
	public Cards[] getCards() {
		shuffle();
		return card;
	}
}
