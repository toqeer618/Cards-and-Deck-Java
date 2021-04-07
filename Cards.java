
public class Cards {
	
	public String suit;
	public int val;

	public Cards(String S, int V) {
		
		suit=S;
		val=V;
	}
	
	public int returnValue(Cards card) {
		
		return card.val;
	}
	
	public String returnSuit(Cards card) {
		
		return card.suit;
	}
}
