import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

//    @Test
//    public void doesntHaveCards(){
//        assertEquals(0, deck.cardCount());
//    }
//
//    @Test
//    public void deckHasCards() {
//        deck.addCards();
//        assertEquals(52, deck.cardCount());
//    }

    @Test
    public void deckHasCards(){
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canRemoveCard(){
        deck.firstCard();
        assertEquals(51, deck.cardCount());
    }

    @Test
    public void deckCanShuffle(){
        deck.shuffleCards();
        Card card = deck.firstCard();
        System.out.println(card.getRank());
        System.out.println(card.getSuit());
        deck.shuffleCards();
        Card card2 = deck.firstCard();
        System.out.println(card2.getRank());
        System.out.println(card2.getSuit());
    }



}
