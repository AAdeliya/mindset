public class non_staticMethods {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;

        //Calling the methods will require an object of type Student.
    }
        //Student s = new Student();
        //s.setName("Danielle");
        //String name = s.getName();

        //Student.setName("Bob"); // Will not work!
       // Student.getName(); // Will not work!
    }

