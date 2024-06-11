
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        //reading and printing the books
        while (true) { 
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRecomm = 0;
            try {
                ageRecomm = Integer.parseInt(scanner.nextLine());  
            } catch (Exception e) {
                System.out.println("Error: "+e.getCause());
                System.out.println("Age recommendation for Book "+input+" will be 99999");
                ageRecomm = 99999;
            }
            System.out.println("");

            bookList.add(new Book(input, ageRecomm));

        }
        System.out.println(bookList.size()+" books in total.\n");
        System.out.println("Books:");
        
        System.out.println("--------");
        System.out.println("--------");
        System.out.println("--------");
        
        Comparator<Book> compare = Comparator.comparing(Book::getAgeRecommendation)
                                            .thenComparing(Book::getBookName);

        Collections.sort(bookList,compare);

        for(Book book : bookList){
            System.out.println(book);
        }

    }

}
