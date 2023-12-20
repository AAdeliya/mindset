public class Vehicle {
    protected String brand = "Ford"; //vehicle attribute
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle{
    private String modelName= "Mustang"; //car attribute

    public static void main(String[] args) {
        //Create a myCar object
        Car myCar = new Car();
        //CAll the honk() method on the myCar object
        myCar.honk();

        //display the value of the brand attribute and the value of
        // the  modelName from the CAr class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
