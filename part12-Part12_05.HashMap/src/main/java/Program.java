
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String,String> mapo = new HashMap<>();
        mapo.add("eins", "11111");
        mapo.add("zwei","222222");
        

        System.out.println(mapo.get("eins"));
        System.out.println(mapo);
        System.out.println(mapo.getListBasedOnKey("eins"));
        

    }

}
