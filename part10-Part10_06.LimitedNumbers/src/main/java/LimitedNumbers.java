
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if(number < 0){
                    break;
                }
                numbers.add(number);
                
            } catch (Exception e) {
                System.out.println("Error: Did you put a number inside? \nErrormessage: "+e.getMessage());
            }
            
        }

        numbers.stream().mapToInt(n -> n).filter(number ->  number >= 1 && number <= 5).forEach(n -> System.out.println(n));
        
    }
}
