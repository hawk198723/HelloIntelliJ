package JAVA8.ConstructorReference.exe1;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorRef {
    @Test
    public void test1(){
        BiFunction<Integer, String, Employee> function = (id, name) -> new Employee(id, name);

        System.out.println(function.apply(1001, "Jason"));

        BiFunction<Integer,String, Employee> function1 = Employee :: new;
        System.out.println(function1.apply(1000, "Kim"));
    }
    @Test
    public void test2(){
        Function<Integer,String[]> func1 = length -> new String[length];
        String[] arr1 = func1.apply(5);
        System.out.println(Arrays.toString(arr1));

        System.out.println("***********************");

        Function<Integer,String[]> func2 = String[] :: new;
        String[] arr2 = func2.apply(10);
        System.out.println(Arrays.toString(arr2));

    }

}
