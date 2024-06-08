
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>();

        while (true) { 
            String line = scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            lines.add(line);
        }

        lines.forEach(l -> System.out.println(l));

    }
}
