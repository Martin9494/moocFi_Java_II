import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

        // my approach
        //1. dont use traditional forloops or while loops to pass the tests of this exercise
        //2. show can  add a new item (e.g itemname and weight)
        //3. user should also make a new suitcase with maxweight(how they want)
        //4. I make the Hold (maxweight for the suitcases)

        Scanner scanner = new Scanner(System.in);

        // Use Stream to process the input without explicit loops
        ArrayList<Item> itemList = new ArrayList<>();

        // Custom method to generate a stream of lines while the condition is met
        List<String> inputLines = generateLines(scanner)
                                        .collect(Collectors.toList());

        // Create a stream of items by processing pairs of lines
        List<Item> items = IntStream.range(0, inputLines.size() / 2)
                                    .mapToObj(i -> new Item(inputLines.get(i * 2), 
                                                            Integer.parseInt(inputLines.get(i * 2 + 1))))
                                    .collect(Collectors.toList());

        // Add all items to itemList
        itemList.addAll(items);

        // Print all items
        itemList.forEach(System.out::println);
        
        


            
        

    }
     // Custom method to generate a stream of lines from Scanner while the lines are not blank
     private static Stream<String> generateLines(Scanner scanner) {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<String>(Long.MAX_VALUE, Spliterator.ORDERED) {
            @Override
            public boolean tryAdvance(Consumer<? super String> action) {
                if (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (!line.trim().isEmpty()) {  // Equivalent check for Java 8
                        action.accept(line);
                        return true;
                    }
                }
                return false;
            }
        }, false);
    }
}

