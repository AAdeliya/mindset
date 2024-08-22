package ComputerScienceClass.BankingSystem2.view;

import java.util.Scanner;

public class BankView {
    private Scanner scanner;

    public BankView() {
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
    public String  getAccountType() {
        System.out.println("Enter account type (savings, checking) : ");
        return scanner.nextLine();

    }
    public String getAccountNumber() {
        System.out.println("Enter account number: ");
        return scanner.nextLine();
    }

    public String getPassword() {
        System.out.println("Enter password: ");
        return scanner.nextLine();
    }

    public int getPin() {
        System.out.println("Enter PIN: ");
        return scanner.nextInt();
    }
}

    

