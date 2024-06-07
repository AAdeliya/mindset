import java.util.Random;

public class GuessIt2 {
    public static void main(String[] args) {
        int random = new Random().nextInt(10) +1;
        while (true){
            String gussedNumbertext = System.console().readLine(" PLease guess number between 1 to 11");
            int gussedNum = Integer.parseInt(gussedNumbertext);
            if(gussedNum== random){
                System.out.printf("The random number was %d. You got it !%n", random);
                return;
            }else{
                System.out.printf("You dind't get it !%n");
                
            }

            }
        }
    }
    
}
