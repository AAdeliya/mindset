import java.time.LocalDate;
import java.time.LocalTime;

public class JavaDate {
    //localDate
    //localtime
    //localdatetime
    //Datetimeformatter
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); //create a date object
        System.out.println(myObj);

        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);
    }
}
