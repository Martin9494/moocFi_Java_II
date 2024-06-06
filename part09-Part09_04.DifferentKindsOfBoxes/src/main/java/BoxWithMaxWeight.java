
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> itemList;

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() > this.capacity){

        }else{
            itemList.add(item);
            this.capacity -= item.getWeight();
            
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item item1 : itemList) {
            if(item1.equals(item)){
                return true;
            }
        }
        return false;
    }

}
