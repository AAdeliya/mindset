package ComputerScienceClass.BankingSystem2;

import ComputerScienceClass.BankingSystem2.controller.BankController;
import ComputerScienceClass.BankingSystem2.model.BankAccountModel;
import ComputerScienceClass.BankingSystem2.view.BankView;

public class Main {
    public static void main(String[] args) {
        BankAccountModel model = new BankAccountModel(1000); // initial balance
        BankView view = new BankView();
        BankController controller = new BankController(model, view);
        controller.run();
    }
    
}
