
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> shopMap;

    public ShoppingCart(){
        
        this.shopMap = new HashMap<>();
    }
    public void add(String product, int price){
        if(shopMap.containsKey(product)){
            Item itemOld = shopMap.get(product);
            itemOld.increaseQuantity();
            

            shopMap.replace(product, itemOld);
        }else{
            shopMap.put(product, new Item(product, 1, price));
        }
        

    }
    public int price(){
        int val = 0;
        for (String string : shopMap.keySet()) {
            val += shopMap.get(string).price();
        }
        return  val;

    }
    public void print(){
        for (String string : shopMap.keySet()) {
            System.out.println(shopMap.get(string));
        }
        
    }

}
