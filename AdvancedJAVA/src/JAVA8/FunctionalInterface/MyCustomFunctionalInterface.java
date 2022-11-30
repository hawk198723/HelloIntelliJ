package JAVA8.FunctionalInterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyCustomFunctionalInterface {
    @Test
    public void  test1(){
        happyTime(70, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("Added some gas, cost me $" + aDouble);
            }
        });

        happyTime(12, money-> System.out.println("Bought a meal, cost me $" + money));
    }

    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("Jason", "Nike", "Bike", "Like", "White", "Yike");

        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("ke");
            }
        });

        System.out.println(filterStrs);

        List<String> filterString1 = filterString(list,s -> s.contains("k"));
        System.out.println(filterString1);

    }

    public List<String> filterString(List<String> list, Predicate<String> predicate){
        ArrayList<String> filterList = new ArrayList<>();

        for (String s: list) {
            if (predicate.test(s)) {
                filterList.add(s);
            }
        }
        return filterList;
    }
}
