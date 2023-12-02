public class ifElse {
    public static void main(String[] args) {
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");

            int age = 24;
            if (age > 18) {
                System.out.println("Age greater than 18");

            }
            //if(condition){
            ////code if condition is true
            //}else{
            ////code if condition is false
            int number = 11;
            if (number % 2 == 0) {
                System.out.println("even number");

            } else {
                System.out.println("odd number");


            }


            int year = 2023;
            if(((year %4==0) && (year%100!=0)) || (year%400==0)){
                System.out.println("LEAP YEAR");
            }
            else{
                System.out.println("COMMON YEAR");

            }

        }
    }
}

