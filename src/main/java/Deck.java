import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
        addCards();
        shuffleCards();

    }


    public int cardCount() {
        return this.cards.size();
    }



    public void addCards() {
        // loop through suit and rank
        for(SuitsType suit : SuitsType.values())
        {
            for(RankType rank : RankType.values())
            {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(cards);


    }

    public Card firstCard(){
        Card card = this.cards.remove(0);
        return card;
    }
}
