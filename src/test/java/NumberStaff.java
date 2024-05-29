import java.math.BigDecimal;

public class NumberStaff {
    public static void main(String[] args) {
        float num1= 2.15f;
        float num2= 1.10f;
        BigDecimal num3 = new BigDecimal(2.15);
        System.out.println(num1-num2);
        BigDecimal num4 = new BigDecimal(1.10);
        System.out.println(num3.subtract(num4));
    }
    
}
