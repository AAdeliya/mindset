import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5)+1; //up but not include 
        System.out.printf("Generated number is: %d.%n", randomNum);
        
        if(randomNum ==1){
            //then
            System.out.println(" The color is RED");
        }else if(randomNum ==2){
            System.out.println("The color is GREEN");
        
        }else if(randomNum==3) { //if is false
            System.out.println("The color is BLUE");

        }else{
            System.out.println("The color is POLKA-DOT");
        }
        }
        // private static boolean shouldIGo(){
        //     return false;

        }

    
    

