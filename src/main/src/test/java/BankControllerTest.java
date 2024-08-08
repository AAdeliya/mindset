  import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class BankControllerTest {
  
class BankControllerTest {

    private BankView view;
    private BankController controller;

    @BeforeEach
    void setUp() {
        view = mock(BankView.class);
        controller = new BankController(view);
    }

    @Test
    void testRun_Deposit() {
        // Setup and test code here
    }

  
}
}
    

