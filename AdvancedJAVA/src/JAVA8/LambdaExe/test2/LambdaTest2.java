package JAVA8.LambdaExe.test2;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

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
}
