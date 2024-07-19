public class Constractor {
    //Create a class
    int x; //Create aa class attribute
    //Create a class constructor for the class
    public Constractor(){
        x=5;
        //Set the initial value for the class attribute x

    }

    public static void main(String[] args) {
        Constractor myObj = new Constractor();
        //Create an object of class (this will call the constructor)
        System.out.println(myObj.x); //Print the value of x
    }
}
