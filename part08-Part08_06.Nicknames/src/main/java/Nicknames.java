
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> object = new HashMap<>();
        object.put("matthew", "matt");
        object.put("michael", "mix");
        object.put("arthur", "artie");

        System.out.println(object.get("matthew"));
    }

}
