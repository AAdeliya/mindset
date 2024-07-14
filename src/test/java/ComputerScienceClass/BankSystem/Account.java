package ComputerScienceClass.BankSystem;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        
            balance += amount;
            System.out.println("Deposited: $" + amount);
        
        }
    

    public void withdraw(double amount) {
      
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
       
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
    
