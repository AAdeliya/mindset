public class Person1 {
    private String name; //private = restricted access

    //Getter
    public String getName() {
        return name;
        //the get method returns the value of the variable name
        //the set method takes a parameter (newName) and assigns it to the name variable. The this keyword is
        //used to refer to the current object
        //however, as the name variable is declared as private, we cannot acccess it from outside this class
    }
        //Setter
        public void setName(String newName){
            this.name = newName;
        }
        
    }
