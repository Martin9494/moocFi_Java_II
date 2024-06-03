
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbbriMap;

    public Abbreviations(){
        this.abbbriMap = new HashMap<>();
        
    }


    public void addAbbreviation(String abbreviation, String explanation){
        abbbriMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
            return abbbriMap.containsKey(abbreviation);   
    }
    public String findExplanationFor(String abbreviation){
        return abbbriMap.get(abbreviation);
    }


}
