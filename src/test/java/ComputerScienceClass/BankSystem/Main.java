package ComputerScienceClass.BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            Bank bank = new Bank();
    
            while (true) {
                System.out.println("\nWelcome to the  Bank System");
                System.out.println("1. Create a new account");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Check balance");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
    
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1: // Create a new account
                        System.out.print("Enter account number: ");
                        String accountNumber = scanner.next();
                        System.out.print("Enter initial balance: ");
                        double balance = scanner.nextDouble();
                        bank.addAccount(accountNumber, balance);
                        break;
                    case 2: // Deposit money
                        System.out.print("Enter account number: ");
                        accountNumber = scanner.next();
                        System.out.print("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        bank.depositToAccount(accountNumber, amount);
                        break;
                    case 3: // Withdraw money
                        System.out.print("Enter account number: ");
                        accountNumber = scanner.next();
                        System.out.print("Enter amount to withdraw: ");
                        amount = scanner.nextDouble();
                        bank.withdrawFromAccount(accountNumber, amount);
                        break;
                    case 4: // Check balance
                        System.out.print("Enter account number: ");
                        accountNumber = scanner.next();
                        bank.printAccountBalance(accountNumber);
                        break;
                    case 5: // Exit
                        System.out.println("Exiting the system.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid number (1-5).");
                }
            }
        }
    }

