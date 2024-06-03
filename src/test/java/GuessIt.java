import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5)+1; //up but not include 
        System.out.printf("Generated number is: %d.%n", randomNum);
        
        if(randomNum <=2){ //1 2 3 4 5 6 7 8
            //then
            System.out.println(" The color is RED");
        }else if(randomNum >=4){
            System.out.println("The color is BLUE");
        
        }else if(randomNum==3) { //if is false
            System.out.println("The color is GREEN");

      
        }
        // private static boolean shouldIGo(){
        //     return false;

        }
    }
    
    

