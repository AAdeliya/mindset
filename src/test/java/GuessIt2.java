import java.util.Random;

public class GuessIt2 {
    public static void main(String[] args) {
        int random = new Random().nextInt(10) +1;
        System.out.printf("Random number is %d.%n", random);
       
        String gussedNumbertext= null; 
        
        int wrongGuessCount =1;
        do{//execute at least one
           gussedNumbertext = System.console().readLine(" PLease guess number between 1 to 11");
            if(gussedNumbertext.matches("-?\\d{1,2}")){
            //increasing complexity of the program by adding nested loop
            int gussedNum = Integer.parseInt(gussedNumbertext);
            if(gussedNum== random){
                String tryText = wrongGuessCount ==1 ? "try" : "tries";
                
                
                
                System.out.printf("The random number was %d. You got it in %d %s!%n", random, wrongGuessCount, tryText);
                return;
            }else{
                wrongGuessCount++;

                System.out.printf("You dind't get it !%n");
if (wrongGuessCount >=4){
    System.out.printf("You've had %d incorrect guesses. The random number ");
return; 


}
            }

            }
            
        } while (!"q".equals(gussedNumbertext));
    }
    //
}
