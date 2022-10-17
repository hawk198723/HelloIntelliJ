package Generic;

import java.util.Arrays;
import java.util.List;

public class UpperBounded {

    public static double sum (List<? extends Number> numberlist) {
        double sum = 0.0;
        for (Number n : numberlist) sum += n.doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("sum of 1 + 2 + 3= " + sum(integerList));

        List<Double> doubleList = Arrays.asList(1.2, 2.4, 6.3, 9.11);
        System.out.println("sum of 1.2 + 2.4 + 6.3 + 9.11 = " + sum(doubleList));
    }
}