import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5)+1; //up but not include 
        System.out.printf("Generated number is: %d.%n", randomNum);
        
        // if(randomNum <2){ //1 2 3 4 5 6 7 8
        //     //then
        //     System.out.println(" The color is RED");
        // }else if(randomNum >4&& (randomNum%2 ==0)){
        //     System.out.println("The color is BLUE");
        
        // }else  { //if is false
        //     System.out.println("The color is GREEN");

      
        // }
        // // private static boolean shouldIGo(){
        // //     return false;

        // }
        switch (randomNum){
            case 1:
            System.out.println("THe color is RED");
            break;
            case 2:
            System.out.println("The color is BLUE");
            break;
            case 3:
            System.out.println("The color is GREEN");
            break;
            case 4:
            System.out.println("THe color is PURPLE");
            break;
            default:
            System.out.println("The color is WHATEVER");




    }}}
    
    

