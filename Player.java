import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Player {
	private Deck D;
	private ArrayList<Cards> P1;
	private ArrayList<Cards> P2;
	private ArrayList<Cards> dP1;
	private ArrayList<Cards> dP2;
	private Stack<Cards> remDeck;
	private Stack<Cards> centreDeck;
	public Player() {
		P1=new ArrayList<>();
		P2=new ArrayList<>();
		dP1=new ArrayList<>();
		dP2=new ArrayList<>();
		remDeck=new Stack<>();
		centreDeck=new Stack<>();
		D=new Deck();
		Cards card[]=D.getCards();
		for (int i = 0; i < 5; i++) {
			P1.add(card[i]);
			dP1.add(card[i]);
		}
		for (int i = 5; i < 10; i++) {
			P2.add(card[i]);
			dP2.add(card[i]);
		}
		for (int i = 10; i < 52; i++) {
			remDeck.push(card[i]);
		}
		centreDeck.push(remDeck.pop());
	}
	public void Rule1(Cards card,ArrayList<Cards> hand,int card_count) {
		Cards C = null;
		boolean flag=false;
		for (Iterator iterator = hand.iterator(); iterator.hasNext();) {
			Cards cards = (Cards) iterator.next();
			if(cards.val==card.val) {
				System.out.println(card.suit+ " of "+ card.val);
				card_count+=card.val;
				C=cards;
				flag=true;
				break;
			}
		}
	if(flag) {
		hand.remove(C);
		centreDeck.push(C);
	}
	else {
		for (int i = 0; i < card_count; i++) {
			hand.add(remDeck.pop());
		}
	}
		
	}
	public void Rule2() {
			
		}
	public void Rule3() {
		
	}
	public void play(Cards card,ArrayList<Cards> hand,ArrayList<Cards> Dhand) {
		Cards C = null;
		boolean flag=false;
		//if(card.val >4 && card.val<11)
			for (Iterator iterator = hand.iterator(); iterator.hasNext();) {
				Cards cards = (Cards) iterator.next();
				if(cards.val==card.val || cards.suit.equals(card.suit) ) {
					System.out.println(card.suit+ " of "+ card.val);
					C=cards;
					flag=true;
					break;
				}
			}
		if(flag) {
			hand.remove(C);
			Dhand.remove(C);
			centreDeck.push(C);
		}
			
	}
	
	public  void player1() {
//		System.out.println("Player 1 is Called");

		play(centreDeck.peek(),P1,dP1);
	}
	
	
	public  void player2() {
//		System.out.println("Player 2 is Called");

		play(centreDeck.peek(),P2,dP2);
	
	}
	public int winner() {
		if(dP1.isEmpty()) {
			return 1;
		}
		else if(dP2.isEmpty()) {
			return 2;
		}
		return 0;
	}
	
	public void dispaly() {
		System.out.println("Player "+1+" has");
		for (Iterator iterator = P1.iterator(); iterator.hasNext();) {
			Cards cards = (Cards) iterator.next();
			System.out.println(cards.suit+ " of "+ cards.val);
			
		}
	}
	
	public void dispaly1() {
		System.out.println("Player "+2+" has");
		for (Iterator iterator = P2.iterator(); iterator.hasNext();) {
			Cards cards = (Cards) iterator.next();
			System.out.println(cards.suit+ " of "+ cards.val);
			
		}
	}
	
}
