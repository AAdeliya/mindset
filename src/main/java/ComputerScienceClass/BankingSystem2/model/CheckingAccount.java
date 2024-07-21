package ComputerScienceClass.BankingSystem2.model;

public class CheckingAccount  extends BankAccountModel{
    private double transactionFee;

    public CheckingAccount(double initialBalance, String accountNumber, String password, int pin, double transactionFee){
        super(initialBalance, accountNumber, password, pin);
        this.transactionFee = transactionFee;
    }

    @Override

    public boolean withdraw (double amount){
        if(amount + transactionFee <= balance){
            balance -= (amount +transactionFee);
           return true;
            }
            return false;
        }
    }


