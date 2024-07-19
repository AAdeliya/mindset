public class JavaMethodsParameters {
    static  void myMethod(String fname, int age){
        //when a parameters is passed to the method it is called an argument
        //fname is a parameter, while Laura, Zhanbo, Rose are arguments
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Laura", 29);
        myMethod("Zhanbo", 27);
        myMethod("Rose", 30);
    }
}
