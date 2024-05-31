public class Wrapper {
    public static void main(String[] args) {
        int num1= 7;
        Integer nym1B= Integer. valueOf(num1); //auto-boxing
        storeData(num1);
        Double myDoubdle = Double.valueOf(255.6);
        Float myFloat = Float.valueOf(23.23f);
        myDoubdle.isNaN(num1);
        int age = Integer.parseInt("25");
        System.out.printf("you will be %d age in 15 years.%n", age+ 15);
        double amount = Double.parseDouble("345.12");
        boolean flag = Boolean.parseBoolean("false");
        System.out.println(flag);



    }
    public static void storeData(Object obj){



    }
    
}
