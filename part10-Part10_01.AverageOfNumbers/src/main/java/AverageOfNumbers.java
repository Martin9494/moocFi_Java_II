
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");


        while (true) {
            String newline = scanner.nextLine();
            if(newline.equals("end")){
                break;
            }
            numbers.add(newline);
        }

        double average = numbers.stream().mapToDouble(s -> Integer.parseInt(s))
        .average().getAsDouble();

        System.out.println("Average number: "+ average);



    }

    //average of the numbers
    
}
