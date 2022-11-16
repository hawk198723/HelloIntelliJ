package JAVAClasses.OtherClasses.BigClass;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigClassTest {

    @Test
    public void test1(){
        BigInteger bi = new BigInteger("122343253456346346346534574675672345");
        System.out.println(bi);

        BigDecimal bd = new BigDecimal("23.54567789023987298367497862349786234987");
        BigDecimal bd2 = new BigDecimal("4");
        System.out.println(bd);
        System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));
    }


}
