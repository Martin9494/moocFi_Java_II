
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("0")){
                break;
            }
            int inputNumber = Integer.parseInt(input);
            if(inputNumber > 0){
                sum += inputNumber;
                counter ++;
            }
            




        }
        if(counter == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println((double) sum/counter);
        }
        

    }
}
