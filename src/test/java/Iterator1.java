import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ///make collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        ///get the iterator
        Iterator <String> it = cars.iterator();
        System.out.println(it.next());

        //looping thought a collection
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
