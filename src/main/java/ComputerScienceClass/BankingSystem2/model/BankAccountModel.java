package ComputerScienceClass.BankingSystem2.model;

public class BankAccountModel {
    protected double balance;
    protected String accountNumber;
    protected String password;
    protected int pin;
    


    public BankAccountModel(double initialBalance, String accountNumber, String password, int pin){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.password = password;
        this.pin= pin;
        //

    }
    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public boolean validatePassword(String inputPassword){
        return this.password.equals(inputPassword);

    }
    public boolean validatePin(int inputPin){
        return this.pin ==inputPin;

    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public boolean validateAccountNumber(String inputAccountNumber){
        return this.accountNumber.equals(accountNumber);

    }
}

