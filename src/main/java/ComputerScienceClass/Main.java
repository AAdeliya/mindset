package ComputerScienceClass;

public class Main {
    public static void main(String[] args) {
        // Dog Peter= new Dog();
        // Peter.eat();
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <=5; i++) {
            printLine("one more");
            System.out.println("i = " + i);
            System.out.println("more");

        }
    }

    public static void printLine(String line) {
        System.out.println(line); 
        
    }
}
