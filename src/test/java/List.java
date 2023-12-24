import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        Collections.sort(cars);
        for (String i : cars){

        }

        System.out.println(cars);

    }
}
