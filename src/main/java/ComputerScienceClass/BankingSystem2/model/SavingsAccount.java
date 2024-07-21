package ComputerScienceClass.BankingSystem2.model;

public class SavingsAccount extends BankAccountModel{
    private double interestRate;
    public SavingsAccount (double initialBalance, String accountNumber, String password, int pin, double interestRate){
        super(initialBalance, accountNumber, password, pin);
        this.interestRate= interestRate;

    }
    public void addInterest(){
        balance +=balance *interestRate;

    }

    
}
