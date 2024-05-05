import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    private int sum;

    public Hand() {
        this.hand = new ArrayList<>();
//        this.sum=0;
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        Iterator<Card> cardIterator = hand.iterator();
        while (cardIterator.hasNext()) {
            System.out.println(cardIterator.next());
        }
    }

    public int sumOfHand() {
        this.sum = 0;
        this.hand.stream().
                forEach(item -> sum += item.getValue());
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        if (this.sumOfHand() == o.sumOfHand()) {
            return 0;
        } else if (this.sumOfHand() < o.sumOfHand()) {
            return -1;
        } else {
            return 1;
        }
    }

    public void sortBySuit() {
        Collections.sort(hand, new SortBySuit());
    }
}
