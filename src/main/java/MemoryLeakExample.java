//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {

    public static void main(String[] args) {
        try {
            List<Object> leakyList = new ArrayList<>();
            while (true) {
                // Adding new byte arrays (100 KB each) continuously
                byte[] block = new byte[100 * 1024]; // 100 KB
                leakyList.add(block);
                
                // Slow down the rate of memory allocation
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
