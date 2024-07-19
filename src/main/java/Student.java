public class Student {
    //private static String name;
    //public static void main(String[] args) {
    //creating an object using new keyword
    //Student obj = new Student();

    String name;
    int mark1;
    int mark2;
    int mark3;
    int total;
    float average;


    void total() {
        total = mark1 + mark2 + mark3;
        System.out.println(("Total" + total));

    }

    void average() {
        average = total / 3;
        System.out.println("Average " + average);
    }







    }
