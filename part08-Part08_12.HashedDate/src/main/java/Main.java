
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // everyobject just a little bit different
        SimpleDate a = new SimpleDate(1, 2, 2001);
        SimpleDate b = new SimpleDate(1, 2, 2002);
        SimpleDate c = new SimpleDate(1, 2, 2003);
        SimpleDate d = new SimpleDate(1, 2, 2004);
        SimpleDate a1 = new SimpleDate(2, 2, 2001);
        SimpleDate b2 = new SimpleDate(1, 3, 2002);
        SimpleDate c3 = new SimpleDate(1, 4, 2003);
        SimpleDate d4 = new SimpleDate(5, 2, 2004);

        //same as the last 2 objects
        SimpleDate c33 = new SimpleDate(1, 4, 2003);
        SimpleDate d44 = new SimpleDate(5, 2, 2004);

        HashMap<SimpleDate, String> dates  = new HashMap<>();
        dates.put(a, "for steve");
        dates.put(b, "for steve");
        dates.put(c, "for steve");
        dates.put(d, "for steve");

        System.out.println("");
        System.out.println(dates.get(a));


        

    }
}
