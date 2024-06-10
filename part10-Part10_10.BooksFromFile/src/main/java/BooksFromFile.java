
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    
    public static void main(String[] args) {
        
        // test your method here
        List<Book> bookList = readBooks("src\\booklist.txt");
        

    }

    public static List<Book> readBooks(String file){
    //name,publishing year,page count,author
        List<Book> bookList = new ArrayList<>();

        try {

            Files.lines(Paths.get(file))

            .map(row -> row.split(","))

            .map(book -> new Book(book[0], Integer.parseInt(book[1]), Integer.parseInt(book[2]), book[3]))

            .forEach(book -> {
                bookList.add(book);
                System.out.println(book);
            });
            
            
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

        return bookList;
    }

}
