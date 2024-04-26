public class HelloWorld {
    public static void main(String[] args) {
        Person johnny = new Person("johnny", "smith", 30);
        //johnny is variable
        Person amy = new Person(); //new instance of the Person
        System.out.format("The person's first name is: %s. ", johnny.getFirstName());

        //johnny.setLastName("smith");
       // System.out.printf("This is last name: %s." , johnny.getFirstName());
       
        
    }
    
}
