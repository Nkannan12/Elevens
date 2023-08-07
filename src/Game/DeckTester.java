package Game;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "4", "10"};
		String[] suits = {"Hearts", "Clubs"};
		int[] values = {1, 4, 10};
		
		Deck deckTest = new Deck(ranks, suits, values);
		
		System.out.print(deckTest.toString());
		deckTest.shuffle();
		deckTest.deal();
		deckTest.deal();
		System.out.println();
		System.out.print(deckTest.toString());
	}
}

