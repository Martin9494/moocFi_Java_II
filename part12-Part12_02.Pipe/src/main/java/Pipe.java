
import java.util.ArrayList;

public class Pipe <T> {

    private ArrayList<T> pipeList;
    public Pipe(){
        this.pipeList = new ArrayList<>();

    }
    public void putIntoPipe(T value){
        this.pipeList.add(value);
    }

    public T takeFromPipe(){
        if(this.pipeList.isEmpty()){
            return null;
        }
        T re = this.pipeList.get(0);
        this.pipeList.remove(0);
        return re;

    }

    public boolean isInPipe(){
        if(!(this.pipeList.isEmpty())){
            return true;
        }
        return false;
    }



}
