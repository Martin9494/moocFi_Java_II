import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cardList;

    public Hand(){
        this.cardList = new ArrayList<>();
    }

    public void add(Card card){
        this.cardList.add(card);
    }
    public void print(){
        Iterator<Card> iterator = this.cardList.iterator();
        while (iterator.hasNext()) {
            Card next = iterator.next();
            System.out.println(next);
        }
    }

    public void sort(){
        Collections.sort(this.cardList);
    }

    @Override
    public int compareTo(Hand o) {
        int sumThis = 0;
        int sumO  = 0;
        Iterator<Card> cards1 = this.cardList.iterator();
        Iterator<Card> cardsO = o.cardList.iterator();

        while (cards1.hasNext()) {
            Card card = cards1.next();
            sumThis += card.getValue();
            
        }
        while (cardsO.hasNext()) {
            Card card = cardsO.next();
            sumO += card.getValue();
            
        }

        return sumThis - sumO;

    }

    public void sortBySuit(){
        Collections.sort(this.cardList, new BySuitInValueOrder());
    }




}
