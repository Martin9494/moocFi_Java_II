import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // test your code here
        ArrayList<Card> cards = new ArrayList<>();

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
          


        


        
    }
}
