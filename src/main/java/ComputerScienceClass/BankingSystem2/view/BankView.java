package ComputerScienceClass.BankingSystem2.view;

import java.util.Scanner;

public class BankView {
    private Scanner scanner;

    public BankView(){
        scanner = new Scanner(System.in);

    }
    public void displayBalance(double balance) {
        System.out.println("Current balance: " + balance);
    }

    public String getUserInput() {
        System.out.println("Enter command (deposit, withdraw, exit): ");
        return scanner.nextLine();
    }

    public double getAmount() {
        System.out.println("Enter amount: ");
        return scanner.nextDouble();
    }
    public void showMessage(String message) {
        System.out.println(message);
    }

    
}
