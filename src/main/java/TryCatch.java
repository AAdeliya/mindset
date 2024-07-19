public class TryCatch {    //exceptions
    //try{
    //block of code to try
    //}
    //catch(Exception e) {
    //Block of code to handle errors
    //}
    public static void main(String[] args) {
        try{

        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); //error!
    }
    catch(Exception e) {
        System.out.println("Something went wrong!");
    }finally{
            System.out.println("The 'try catch is finished");

            checkAge(15);
    }}


        //If an error occurs, we can use try...catch to catch the error and execute some code to handle it:



    //the thorow statement allows you to create a custom error
    //Example
    //Throw an exception if age is below 18 (print "Access denied").
    // If age is 18 or older, print "Access granted":

    static void checkAge(int age){
        if(age <18) {
            throw new ArithmeticException(("access denied -You must be at least 18 years old"));
        }else
        {
            System.out.println("Access granted - You are old enough!");

        }
    }


    }

