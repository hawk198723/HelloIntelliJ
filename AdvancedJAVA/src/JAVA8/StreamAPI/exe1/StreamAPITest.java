package JAVA8.StreamAPI.exe1;

import java.util.Arrays;
import java.util.List;

public class StreamAPITest {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(6,4,7,9,1);


        nums.stream()
                .filter(n -> n % 2 == 1)
                .forEach(System.out::println);

        System.out.println("************************");

        nums.parallelStream().
                filter(n -> n % 2 == 1).
                map(n->n*2).
                forEach(System.out::println);
        System.out.println("************************");

        nums.stream().
                filter(n -> n % 2 == 1).
                map(n->n*2).
                sorted().
                forEach(System.out::println);

        System.out.println("************************");


        int sum =  nums.stream()
                                .filter(n -> n % 2 == 1)
                                .reduce(0,(c, e)->c+e);
        System.out.println(sum);


    }
    
}
