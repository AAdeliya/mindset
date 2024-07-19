
import java.util.Scanner;
public class JavaUserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //create a Scanner object
        System.out.println("enter username");
        String userName = myObj.nextLine(); //read user input
        System.out.println("Username is: " + userName);

        int age= myObj.nextInt();
        double salary = myObj.nextDouble();

        //output input by user
        System.out.println("Name: " + userName);
        System.out.println(" Age " +age);
        System.out.println("Salary: " + salary);
    }
    //Scanner class is used to get user input-->java.util package
}
