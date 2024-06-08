
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> numberList = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) { 
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }else if(row.isEmpty()){

            }else{
                numberList.add(row);
            }
            
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String NorP = scanner.nextLine();
        //average of negative
        //average of positive
        double avg = 0.0;
        if(NorP.equals("n")){
            avg = numberList.stream()
            .mapToDouble(v -> Double.valueOf(v))
            .filter(number -> number < 0)
            .average().getAsDouble();
        }else if(NorP.equals("p")){
            avg = numberList.stream()
            .mapToDouble(v -> Double.valueOf(v))
            .filter(number -> number > 0)
            .average().getAsDouble();
        }else{

        }

        System.out.println("Average of the numbers: "+avg);


    }
}
