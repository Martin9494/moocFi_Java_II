
import java.util.HashMap;

public class IOU {


    private HashMap<String,Double> debtList;

    public IOU(){
        this.debtList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        debtList.put(toWhom, amount);

    }
    public double howMuchDoIOweTo(String toWhom){

        if(String.valueOf(this.debtList.get(toWhom)).equals("null")){
            return 0;
        }else{
            return this.debtList.get(toWhom);
        }
    }

}
