import java.security.SecureRandom;
import java.util.Random;

public class Math {
    public static void main(String[] args) {
        //System.out.println(Math.ceil(5.0)); //round up to integer celling
        //floor -->
        //Math.min(num1, num2) -->3 output
        //int num1=3, num2=5
        //max -->5
        //pow
        //random -->
        //sqrt-->root
        //Math.PI
        Random random= new Random();
        System.out.println(random.nextInt(10));
        SecureRandom random1= new SecureRandom();
        System.out.println(random1.nextInt(10));



    
    }
    //public static double calcAreaCircle(double radius){
        //A=PI*r^2
        //return Math.PI * Math.pow(radius, 2);


    }








    
}
