package ComputerScienceClass.BankingSystem2.controller;

import ComputerScienceClass.BankingSystem2.model.BankAccountModel;
import ComputerScienceClass.BankingSystem2.view.BankView;

public class BankController {
    private BankAccountModel model;
    private BankView view;

    public BankController(BankAccountModel model, BankView view){
        this.model = model;
        this.view = view;

    }
    public void run() {
        while (true) {
            String command = view.getUserInput();
            if (command.equalsIgnoreCase("deposit")) {
                double amount = view.getAmount();
                if (model.deposit(amount)) {
                    view.showMessage("Deposit successful.");
                } else {
                    view.showMessage("Deposit failed.");
                }
            } else if (command.equalsIgnoreCase("withdraw")) {
                double amount = view.getAmount();
                if (model.withdraw(amount)) {
                    view.showMessage("Withdrawal successful.");
                } else {
                    view.showMessage("Withdrawal failed.");
                }
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                view.showMessage("Invalid command.");
            }
            view.displayBalance(model.getBalance());
        }
    }
}

