package JAVA8.StreamAPI.exe2Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(98);
        arrayList.add(56);
        arrayList.add(34);
        arrayList.add(46);

        System.out.println("Number unsorted: "+ arrayList);

        System.out.println("#############################################################");

        List<Integer> list = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Number sorted(min -> max): " + list);

        System.out.println("#############################################################");

        List<Integer> list1 = arrayList.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
        System.out.println("Number sorted(max -> min): " + list1);

        System.out.println("#############################################################");

        List<Integer> list2 = arrayList.stream().sorted((a,b)-> (a<b)? 1:(a>b)?-1:0).collect(Collectors.toList());
        System.out.println("Number sorted(max -> min): " + list2);

        System.out.println("#############################################################");

        arrayList.stream().
                filter(n -> n % 2 == 1).
                map(n->n*2).
                sorted().
                forEach(System.out::println);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
