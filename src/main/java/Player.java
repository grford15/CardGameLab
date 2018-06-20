import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;
    private int handValue;

    Deck deck;
    Card card;

    public Player(String name, int handValue) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.handValue = 0;
        deck = new Deck();
    }

    public String getName() {
        return name;
    }

    public int getHand() {
        return this.hand.size();
    }

    public void addCard() {
        Card firstCard = deck.firstCard();
        this.hand.add(firstCard);
        handValue += firstCard().getValueFromEnum();
    }

    public int getHandValue() {
        return handValue;
    }

    public Card firstCard() {
        return this.hand.get(0);
    }
}
