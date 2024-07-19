package ComputerScienceClass.BankSystem;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("New account created for " + accountNumber);
        } else {
            System.out.println("Account already exists!");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account does not exist");
        }
    }

    public void printAccountBalance(String accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            System.out.println("The balance of " + accountNumber + " is " + account.getBalance());
        } else {
            System.out.println("Account does not exist");
        }
    }
}
    
