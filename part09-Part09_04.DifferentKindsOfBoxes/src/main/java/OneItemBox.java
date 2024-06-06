
import java.util.ArrayList;

public class OneItemBox extends Box {

    ArrayList<Item> itemList;

    public OneItemBox(){
        this.itemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.itemList.isEmpty()){
            itemList.add(item);
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item item1 : this.itemList) {
            if(item1.equals(item)){
                return true;
            }
        }
        return false;
    }

}
