package sheridan.card;

public class Card {

        public enum Suit { HEARTS, CLUBS , SPADES , DIAMONDS };
        public enum Value  { ACE , TWO , THREE, FOUR, FIVE, SIX , SEVEN ,
                    EIGHT, NINE, TEN , JACK , QUEEN , KING };
        
	private final Value value;
	private final Suit suit;
         
        public Card ( Suit suit , Value value ) {
            this.suit = suit;
            this.value = value;
        }

	public Value getValue() {
            return this.value;
	}

	public Suit getSuit() {
            return suit;
	}
        
        public String toString( ) {
            return value + " of " + suit;
        }

}