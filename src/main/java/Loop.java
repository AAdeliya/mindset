import java.util.Random;

public class Loop {
    public static void main(String[] args) {
        while(true){

        
        int rabdomNum= new Random().nextInt(10) +1;
        String gussedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively");
        int gussedNum = Integer.parseInt(gussedNumText);
        if (gussedNum == rabdomNum) {
            System.out.printf("The random number was %d. You got it !%n", rabdomNum);


        } else { 
            System.out.printf("The random number was %d. You didn't get it!", rabdomNum);

        }
    }

        
    }
    
}
