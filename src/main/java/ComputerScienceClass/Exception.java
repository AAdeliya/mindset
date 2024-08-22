package ComputerScienceClass;

public class Exception {
    public static void main(String[] args) {
        int a =1;
        int b = 0;

        //try block to check for exceptions

       try{
        int i = computeDivision(a,b);
       } 
       catch (ArithmeticException ex) {
        System.out.println(ex.getMessage());
        
       }

    }

    private static int computeDivision(int a, int b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'computeDivision'");
    } 
}
