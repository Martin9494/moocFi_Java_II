





public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        String[] testInputs = {"04:59:31", "12:34:56", "23:59:59", "24:00:00", "00:60:00", "00:00:60", "12:345:56"};

        // Print results of matching each test input
        for (String input : testInputs) {
            System.out.println(input + ": "+check.timeOfDay(input));
            
        }
    }
}
