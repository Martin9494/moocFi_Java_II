
import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = scanner.nextLine();
            

            if (continueQ.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Input the year of birth: ");
            int birthYear = Integer.parseInt(scanner.nextLine());

            Person p = new Person(firstName, lastName, birthYear);
            persons.add(p);
            System.out.println(p);

            
        }

        // Implement the printing of the unique last names in alphabetical order here:
        persons.stream().map(person -> person.getLastName()).distinct().sorted().forEach(n -> System.out.println(n));

    }
}
