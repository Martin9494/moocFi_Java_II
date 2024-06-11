
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class LiteracyComparison {
    
    public static void main(String[] args) {

        ArrayList<String> file = readFile("literacy.csv");
        ArrayList<Literacy> litList = new ArrayList<>();
        for (String string : file) {
            String[] row = string.split(",");
            
            if(row.length == 6){

            
            litList.add(new Literacy(row[0].trim(), row[1].trim(), row[2].trim(), row[3],Integer.parseInt(row[4]), row[5].trim()));
            }
        }
        

        litList.stream().sorted((lit1, lit2) -> {
            return lit1.getPercent().compareToIgnoreCase(lit2.getPercent());
        }).forEach(lit -> System.out.println(lit));

        
    }


    public static ArrayList<String> readFile (String fileName){
        ArrayList<String> rows = new ArrayList<>();
        try(Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNext()) { 
                String nextRow = scanFile.nextLine();
                rows.add(nextRow);
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }

        return rows;


    }
}
