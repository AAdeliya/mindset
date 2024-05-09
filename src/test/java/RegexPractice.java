import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        //System.out.println("cat".matches("[^c]at"));
         //\\w for letters 
         //\\d for numbers 
         String regex= "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)\\d{4}";

         //{1,2}--qualifiers, how many times this patttern should be applied
         String phoneNumber="1.232.333.2365";
        System.out.println("232.333.2365".matches(regex));
        Pattern pat = Pattern.compile(regex);
        //expensive operation for CPU 
        Matcher mat =pat.matcher(phoneNumber);
        //does this phone number matches the pattern regex

        if(mat.matches())
        {
          System.out.println(mat.group(1));
          System.out.println(mat.group(2));
          System.out.println(mat.group(3));
          
          //true
          //null
          //333.
        }

    }

    
    
}
