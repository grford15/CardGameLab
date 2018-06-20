import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class PlayerTest {

    Player player1;
    Player player2;
    Card card;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Greg", 0);
        player2 = new Player("Cleyra", 0);
        deck = new Deck();

    }

    @Test
    public void playerHasName(){
        assertEquals("Greg", player1.getName());
    }

    @Test
    public void playerHasCard(){
        player1.addCard();
        assertEquals(1, player1.getHand());
    }

    @Test
    public void checkCardValue(){
        player1.addCard();

    }

    @Test
    public void playerHaveDifferent(){
        player1.addCard();
        deck.shuffleCards();
        player2.addCard();
        assertNotEquals(player1.firstCard(), player2.firstCard());


    }



    @Test
    public void playerHandValue(){
        player1.addCard();
        assertEquals(Range.be, player1.getHandValue());
    }






}
