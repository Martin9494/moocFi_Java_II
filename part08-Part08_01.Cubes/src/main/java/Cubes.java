
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int inputToNumber = Integer.parseInt(input);
            System.out.println(inputToNumber*inputToNumber*inputToNumber);

            
        }

    }
}
