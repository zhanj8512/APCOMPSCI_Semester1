import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		cards = new ArrayList<Card>();
        for (int k = 0; k < ranks.length; k++)
        {
            for(int j = 0; j< suits.length; j++)
            {
                Card card1 = new Card(ranks[k], suits[j], values[k]);
                cards.add(card1);
            }
        }
        size = cards.size();
        shuffle();
		
		
	
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size ==0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return cards.size();
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() 
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		for(int k = 0; k < size; k++) 
		{
            int r = (int)(Math.random() * k);    
            Card temp = cards.get(k);
            cards.set(r, cards.get(k));
            cards.set(k, temp);
            
        }
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() 
	{
		size = size - 1;
        if (size > 0) 
        {
            return cards.get(size);
        }
        return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) 
		{
		    
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		
		for (int k = cards.size() - 1; k >= size; k--) 
		{
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
