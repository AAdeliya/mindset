public class HelloWorld {
    public static void main(String[] args) {
        Person johnny = new Person("Johnny", "Smith", 30);
        //johnny is variable
        Person amy = new Person(); //new instance of the Person
        System.out.format("The person's first name is: %s. ", johnny.getFirstName());
    }
    
}
