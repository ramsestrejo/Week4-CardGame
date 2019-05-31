/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan.card;

/**
 *
 * @author ramses
 */
public class CardGame {
    
   public static void main( String args [ ] ) {
       
       String value = args [ 0 ];
       String suit = args[ 1 ];

       
            // create deck with 52 cards
       Deck deck = new Deck( );
       deck.setSize( 52 );
       deck.generateDeck( );
       
            // create magic hand
       MagicHand hand = new MagicHand( );
       hand.generateHand( 7 , deck.getDeck( ) );
       System.out.println( hand.toString( ) );
       
       Card card = deck.findCard(value, suit);
       System.out.println( "Card selected is " + card.toString( ) );
       System.out.println( "Is your card on the magic hand: " + hand.isCardInHand( card ) );
       
   }
    
}
