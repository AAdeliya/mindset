public class Person {
    private String firstname;
    private int age;
    private String name;
    private String lastname;

    public Person(){
        //no arg constructor, does not take any inputs

    }
    public Person(String firstname, String lastname, int age){
        this.firstname= firstname;
        this.lastname= lastname;
        this.age= age;

        //you can pass a value for firstname, lastname, age


    }
    public String getFirstName()
    { 
        return firstname.substring(0, 1).toUpperCase() + firstname.substring(1);

    }
    public int getAge(){ return age;}
    public void setAge(int age) {this.age= age;}

    public void setName(String john) {
    }
}
