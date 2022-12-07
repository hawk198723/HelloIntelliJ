package JAVA8.StreamAPI.exe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {

    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(6,4,7,9,1);


        nums.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList())
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

        System.out.println("************************");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(89);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(55);
        arrayList.add(6);
        arrayList.add(9);

        List<Integer> list=arrayList.stream().
                filter(integer -> integer % 3==0).
                map(n->n*5).collect(Collectors.toList());

        System.out.println(list);

        System.out.println(arrayList.stream().
                filter(integer -> integer % 3 == 0).
                map(n -> n * 5).count());


    }
    
}
