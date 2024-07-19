public class Functions {
    public static void main(String[] args) {
        helloWorld();
        int c = sum(3, 5);
        System.out.println(c);


        welcome();
        multiply(5,10);
        multiply(2,3);
        multiply(6,7);


    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void welcome(){
        System.out.println("Welcome to our calculator!");
    }

    public static void helloWorld() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Adeliya!");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }



    //Do something here
    //foo is a method we defined in class Main. Notice a few things about foo.
    //
    //static means this method belongs to the class Main and not to a specific instance of Main. Which means we can call the method from a different class like that Main.foo().
    //void means this method doesn't return a value. Methods can return a single value in Java and it has to be defined in the method declaration. However, you can use return by itself to exit the method.
    //This method doesn't get any arguments, but of course Java methods can get arguments as we'll see further on.


}



