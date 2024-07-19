import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("BMW");
        System.out.println(cars);
        //even BMW is added twice it  only appears once
        // in the set because every item in a set has to be unique

        //to check whether an item exist in HashSet, use the contains() method:
        cars.contains("Mazda");
        //remove();
        cars.remove("BMW");
        cars.clear(); //remove all

    }
}
