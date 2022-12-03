package JAVA8.FunctionalInterface.BiSeries.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a,b)-> (a+b) %2==0;
        System.out.println(biPredicate.test(1, 3));

        BiPredicate<String, Integer> biPredicate1 = (a,b)-> a.length()<b;
        System.out.println(biPredicate1.test("Jason", 3));

    }


}
