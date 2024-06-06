
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box Bigbox = new Box(20);
        Box box = new Box(10);

        Bigbox.add(box);
        box.add(new Book("Horsemann", "book of shit", 1));


        
        System.out.println(Bigbox);
    }

}
