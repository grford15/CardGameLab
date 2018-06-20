import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(SuitsType.HEARTS, RankType.SIX);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitsType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.SIX, card.getRank());
    }

    @Test
    public void canGetValueFromCar(){
        assertEquals(6, card.getValueFromEnum());
    }

    @Test
    public void canGetName() {
        assertEquals("Six of HEARTS", card.niceName());
    }

    @Test
    public void canGetAllSuits(){
        SuitsType[] expected = {SuitsType.HEARTS, SuitsType.DIAMONDS, SuitsType.SPADES, SuitsType.CLUBS};
        SuitsType[] suits = SuitsType.values();
        assertEquals(4, suits.length);
        assertArrayEquals(expected, suits);
    }

    @Test
    public void canLoopThroughSuits(){
        ArrayList<SuitsType> suits = new ArrayList<SuitsType>();
        for(SuitsType suit : SuitsType.values()){
            suits.add(suit);
        }
        assertEquals(4, suits.size());
    }
}
