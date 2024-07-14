package ComputerScienceClass;

class NumberHolder {
    int number;

    // Default constructor initializes number to a default value. Can be omitted.
NumberHolder() {
    this.number = 10;
    }
    // Parameterized constructor initializes number to the provided value
    NumberHolder(int number) {
    this.number = number;
    }
    // Copy constructor makes a copy of the provided object
    NumberHolder(NumberHolder n) {
    this.number = n.number;
    }
    public static void main(String[] args) {
    NumberHolder holder1 = new NumberHolder(); // Calls default constructor
    NumberHolder holder2 = new NumberHolder(20); // Calls parameterized constructor
    NumberHolder holderCopy = new NumberHolder(holder2); // Calls copy constructor
    System.out.println("Value of holder1's number: " + holder1.number);
    System.out.println("Value of holder2's number: " + holder2.number);
    System.out.println("Value of holder2's number: " + holderCopy.number);
    }
    }
    // constructor overloading: same name
    // but different arguments

