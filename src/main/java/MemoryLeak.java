import java.util.ArrayList;
import java.util.List;

public class MemoryLeak {
    public static void main(String[] args) {
        try {
            // Declare a list to hold byte arrays
            List<byte[]> leakyList = new ArrayList<>();
            while (true) {
                // Add a new 100 KB byte array to the list in each iteration
                byte[] block = new byte[100 * 1024]; // 100 KB
                leakyList.add(block);

                // Delay slightly to make the memory increase observable
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    

