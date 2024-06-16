
import java.util.ArrayList;

public class Hideout <T> {
    private ArrayList<T> value;

    public Hideout(){
        this.value = new ArrayList<>();
    }

    public void putIntoHideout(T toHide){
        if(value.isEmpty()){
            this.value.add(toHide);
        }
    }

    public T takeFromHideout(){
        if(!(this.value.isEmpty())){
            T re =  this.value.get(0);
            this.value.remove(0);
            return re;
        }
        return null;
    }
    public boolean isInHideout() {
        if(!(this.value.isEmpty())){
            return true;
        }
        return false;
    }

}
