public class RegexPractice {
    public static void main(String[] args) {
        //System.out.println("cat".matches("[^c]at"));
         //\\w for letters 
         //\\d for numbers 
        System.out.println("321.333.7652".matches("\\d{3}[-.]\\d{3}[-.]\\{4}"));
    }
    
}
