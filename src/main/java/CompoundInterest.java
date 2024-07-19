import java.math.BigDecimal;



public class CompoundInterest {
    
    public static BigDecimal calculate(int i, double h, int peroid, int j ){

    BigDecimal a = BigDecimal .ONE.add(new BigDecimal(h)); //1+r
    BigDecimal b= a.multiply(new BigDecimal(peroid));// (1+r)Y
    BigDecimal c = b.subtract(BigDecimal.ONE);//((1+r)Y-1)
    BigDecimal d = c.divide(new BigDecimal(h));//((1+r)Y-1) /r
    BigDecimal e = d.multiply(new BigDecimal(j));// c[ ((1+r)Y -1)/r]
    BigDecimal f = a.multiply(new BigDecimal(i)).multiply(new BigDecimal(peroid));
    BigDecimal g = f.add(e);
    return g;



    }

    public static void main(String[] args) {
        BigDecimal result = CompoundInterest.calculate(10000, 0.8, 10, 1000);
        System.out.println(result);
    }


        
    }
    

