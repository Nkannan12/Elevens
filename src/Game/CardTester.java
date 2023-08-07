package Game;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("3", "clubs", 3);
		Card c2 = new Card("3", "clubs", 3);
		Card c3 = new Card("3", "hearts", 3);
		
		c1.suit();
		c1.rank();
		c1.pointValue();
		
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}

