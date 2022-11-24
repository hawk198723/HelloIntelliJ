package JAVA8.LambdaExe.test2;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest2 {
    @Test
    public void test1(){
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("Wut up!");

        System.out.println("###################################");

        Consumer<String> consumer2 = System.out :: println;
        consumer2.accept("WaLah!!");
    }

    @Test
    public void test3(){
        Comparator<Integer> comparator = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(comparator.compare(12, 33));
        Comparator<Integer> comparator1 = Integer :: compare;
        System.out.println(comparator1.compare(63, 55));
    }

    @Test
    public void test4(){
        Function<Double,Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(func.apply(89.8));

        Function<Double, Long> function = aDouble -> Math.round(aDouble);
        System.out.println(function.apply(12.4));

        Function<Double,Long> function1 = Math ::round;
        System.out.println(function1.apply(15.4));
    }


// class :: static method (hard level)
    @Test
    public void test5(){
        Comparator<String> comparator = (s1,s2) -> s1.compareTo(s2);
        System.out.println(comparator.compare("abc", "abd"));

        Comparator<String> comparator1 = String::compareTo;
        System.out.println(comparator1.compare("abf", "abk"));
    }

    @Test
    public void test6(){
        BiPredicate<String,String> biPredicate = (t1,t2) -> t1.equals(t2);
        System.out.println(biPredicate.test("abc", "abc"));

        BiPredicate<String,String> biPredicate1 = String::equals;
        System.out.println(biPredicate1.test("rrr", "rrr"));
    }

    @Test
    public void test7(){
// need to create Employee class
//        Employee employee = new Employee(1001, "jerry",23, 6000);
//
//        Function<Employee, String> function = (s1)-> s1.getName();
//        System.out.println(function.apply(employee));
//
//        Function<Employee, String> function1 = Employee::getName;
//        System.out.println(function1.apply(employee));


    }
}
