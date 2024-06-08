
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        // test your method here

        while (true) {
            String line = scanner.nextLine();
            
            if(line.equals("end")){
                break;
            }else if(line.equals("")){

            }else{
                numbers.add(Integer.parseInt(line));
            }
            
        }

        System.out.println(positive(numbers));

    }

    public static List<Integer> positive(List<Integer> numbers){

        //numbers= numbers.stream().filter(n -> n > 0).map(n -> n).collect(Collectors.toCollection(ArrayList::new ));
        numbers= numbers.stream().filter(n -> n > 0).map(n -> n).collect(Collectors.toList());

        return numbers;
    }

}
