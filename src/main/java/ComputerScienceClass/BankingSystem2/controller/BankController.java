package ComputerScienceClass.BankingSystem2.controller;
import ComputerScienceClass.BankingSystem2.model.BankAccountModel;
import ComputerScienceClass.BankingSystem2.model.CheckingAccount;
import ComputerScienceClass.BankingSystem2.model.SavingsAccount;
import ComputerScienceClass.BankingSystem2.view.BankView;

public class BankController {
    private BankView view;
    private BankAccountModel account;


    public BankController(BankView view){
        this.view = view;
        String accountNumber = view.getAccountNumber();
        String password = view.getPassword();
        int pin = view.getPin();
        String command = view.getAccountType();//
        
        
        if (command.equalsIgnoreCase("savings")) {
            this.account = new SavingsAccount(2000, "111", "111", 111, 0.05);
            System.out.println("Account type is Savings");
            } else {
                view.showMessage("Account type is Checking");
                this.account = new CheckingAccount(1000, "222", "222", 222, 2);
         
            }
    }
    
    public void run() {
        String inputPassword = view.getPassword();
        int inputPin = view.getPin();
        String inputAccountNumber = view.getAccountNumber();
       
        // if(!account.validateAccountNumber(inputAccountNumber)){
        //     view.showMessage(inputAccountNumber + "Account Number does not exist!");
        // }
        
        if (!account.validatePassword(inputPassword) || !account.validatePin(inputPin)) {
            view.showMessage("Authentication failed. Please provide correct password!");
            return;
        }

        while (true) {
            String command = view.getUserInput();
            if (command.equalsIgnoreCase("deposit")) {
                double amount = view.getAmount();
                if (account.deposit(amount)) {
                    view.showMessage("Deposit successful.");
                } else {
                    view.showMessage("Deposit failed.");
                }
            } else if (command.equalsIgnoreCase("withdraw")) {
                double amount = view.getAmount();
                if (account.withdraw(amount)) {
                    view.showMessage("Withdrawal successful.");
                } else {
                    view.showMessage("Withdrawal failed.");
                }
                }else if(command.equalsIgnoreCase("interest") && account instanceof SavingsAccount){
                    ((SavingsAccount) account).addInterest();
                    view.showMessage("Interest added.");
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                view.showMessage("Invalid command.");
            }
            view.displayBalance(account.getBalance());
        }
    }
}

