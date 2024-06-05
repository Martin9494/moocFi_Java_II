
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations(){
        this.dict = new HashMap<>();
    }
    public void add(String word, String translation){
        this.dict.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = this.dict.get(word);
        translations.add(translation);
    }
    public ArrayList<String> translate(String word){
        if(this.dict.get(word) == null){
            return new ArrayList<String>();
        }
        return this.dict.get(word);
    }
    public void remove(String word){
        this.dict.remove(word);
    }





}
