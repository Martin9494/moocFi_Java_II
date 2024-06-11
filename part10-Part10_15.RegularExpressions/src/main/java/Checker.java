import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {

    public boolean isDayOfWeek(String string){
        //tomuch..
        //String patternString = "(mon(day)?|tue(s(day)?)?|wed(nes(day)?)?|thu(r(s(day)?)?)?|fri(day)?|sat(ur(day)?)?|sun(day)?)";
  /*      String patternString = "(mon|tue|wed|thu|fri|sat|sun)";
        // Create a Pattern object
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        
        // Create a Matcher object
        Matcher matcher = pattern.matcher(string.trim());
        
        // Return whether the input matches the pattern
        return matcher.matches();*/


        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public boolean allVowels(String string){
        String patternString = "^[aeiouAEIOU]+$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(string.trim());
        return matcher.matches();
    
    }
    public boolean timeOfDay(String string){
                // Define a pattern to match valid HH:MM:SS time (correct regex)
                String patternString = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        
                // Create a Pattern object
                Pattern pattern = Pattern.compile(patternString);
                
                // Create a Matcher object
                Matcher matcher = pattern.matcher(string.trim());
                
                // Return whether the input matches the pattern
                return matcher.matches();
    }

}
