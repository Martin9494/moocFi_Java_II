

import java.awt.Container;
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container("First");
        Container container2 = new Container("Second");

        
        

        while (true) {
            System.out.println(container1);
            System.out.println(container2);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }else if(input.contains("add")){
                int number = Integer.parseInt(input.split(" ")[1]);
                container1.add(number);
            }else if(input.split(" ")[0].equals("move")){
                int number = Integer.parseInt(input.split(" ")[1]);
                container1.move(number, container2);
            }else if(input.split(" ")[0].equals("remove")){
                int number = Integer.parseInt(input.split(" ")[1]);
                container2.remove(number);
            }else{

            }

        }
    }


}