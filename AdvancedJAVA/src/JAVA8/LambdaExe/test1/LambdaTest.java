package JAVA8.LambdaExe.test1;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {

    @Test
    public void test1(){
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Lambda Test!");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("Lambda Test2! ");
        };
        runnable2.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(comparator.compare(12, 22));

        Comparator<Integer> comparator1 = (o1, o2) -> {
            return Integer.compare(o1, o2);
        };

        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);

        System.out.println(comparator1.compare(42, 22));

        Comparator<Integer> comparator3 = Integer :: compare;
        System.out.println(comparator3.compare(42, 92));
    }

    @Test
    public void test3(){

    }
}
