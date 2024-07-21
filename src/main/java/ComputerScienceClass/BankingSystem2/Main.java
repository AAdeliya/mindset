package ComputerScienceClass.BankingSystem2;

import ComputerScienceClass.BankingSystem2.controller.BankController;
import ComputerScienceClass.BankingSystem2.view.BankView;

public class Main {
    public static void main(String[] args) {
        BankView view = new BankView();
        BankController controller = new BankController(view);
        controller.run();
    }
    
}
