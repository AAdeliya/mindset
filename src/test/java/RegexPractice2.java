public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("cat doggy".matches("...\\s\\b.....$"));
        //. represent any character 
        //in this case ..... returns true
        //^..... begining of the line 
        //$ end of the string
        //\\b boundary 
        //\\s space 
        //\\W not words characaters letters number and under scores 
        //\\D not digits
        
    }
    
}
