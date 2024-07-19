import java.text.DecimalFormat;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class NumberFormat {
    public static void main(String[] args)  throws ParseException{
         DecimalFormat df = new DecimalFormat("#");
         System.out.println(df.format(5.60));
   

    }
}
