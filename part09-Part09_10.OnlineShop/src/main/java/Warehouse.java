
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;


    public Warehouse(){
        this.productsPrice = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);

    }

    public int price(String product){
        if(productsPrice.get(product) == null){
            return -99;
        }

        return productsPrice.get(product);

    }

    public int stock(String product){
        if(productsStock.get(product) == null){
            return 0;
        }

        return productsStock.get(product);

    }
    public boolean take(String product){
        if(productsStock.get(product) == null || productsStock.get(product) == 0){
            return false;
        }
        
        
        int value = productsStock.get(product);
        productsStock.replace(product, value-1);
        return true;
    }

    public Set<String> products(){
        Set<String> products = (Set) this.productsPrice.keySet();
        return products;
    }

    


}
