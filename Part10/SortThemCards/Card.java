public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }
    @Override
    public int compareTo(Card object) {
        if (this.value == object.getValue()) {
            return 0;
        } else if (this.value > object.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
