package dictionary;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class SaveableDictionary {
    private HashMap<String,String> dict;
    private HashMap<String,String> dictR;
    private String file;
    
    public SaveableDictionary(String file){
        this.dict = new HashMap<>();
        this.dictR = new HashMap<>();
        this.file = file;
    }

    public SaveableDictionary() {
        this.dict = new HashMap<>();
        this.dictR = new HashMap<>();
    }

    public boolean load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(this.file)))) {
            String line;
            System.out.println("Loading-------------BEGIN");
            while ((line = reader.readLine()) != null) {
                
                System.out.println(line);
                String[] splits = line.split(":");
                if(splits.length == 2){
                    this.add(splits[0], splits[1]);
                }else{
                    System.err.println("load file problem => Splitting row length should be 2 !");
                }
                
            }
            System.out.println("Loading-------------END");
            return true; // Return true if the file is read successfully
        } catch (IOException e) {
            System.err.println("IOExeption: "+e.getMessage());
            return false; // Return false if there is an IOException
        }
    }
    

    public void add(String words, String translation){
        if(this.dict.containsKey(words) || this.dictR.containsKey(words)){
           
        }else{
            this.dict.put(words, translation);
            this.dictR.put(translation, words);
        }

    }

    public String translate(String word){
        if(this.dict.containsKey(word)){
            return this.dict.get(word);
        }else if(this.dictR.containsKey(word)){
            return this.dictR.get(word);
        }else{
            return null;
        }


    }

    public void delete(String word){
        if(this.dict.containsKey(word) ){
           String val = this.dict.remove(word);
           this.dictR.remove(val);
        }else if (this.dictR.containsKey(word)){
            String val = this.dictR.remove(word);
            this.dict.remove(val);
        }else{

        }
    }
    public boolean save() {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(this.file))) {
            StringBuilder data = new StringBuilder();
            for (String key : this.dict.keySet()) {
                data.append(key).append(":").append(this.dict.get(key)).append("\n");
            }
            output.write(data.toString());
            return true;
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    


}
