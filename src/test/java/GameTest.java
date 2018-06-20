import org.junit.Before;
import org.junit.Test;

public class GameTest {

    Player player1, player2;
    Deck deck;

    @Before
    public void before(){
        player1 = new Player("Greg", 0);
        player2 = new Player("Cleyra", 0);
        deck = new Deck();
        player1.addCard();
        player2.addCard();
    }

    @Test
    public void compareHands(){


    }
}
