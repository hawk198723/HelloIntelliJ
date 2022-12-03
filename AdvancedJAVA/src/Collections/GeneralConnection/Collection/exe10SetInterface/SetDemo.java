package Collections.GeneralConnection.Collection.exe10SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set= new HashSet<>();
        Set<Integer> set= new TreeSet<>();

        System.out.println(set.add(45));
        System.out.println(set.add(65));
        System.out.println(set.add(74));
        System.out.println(set.add(74)); // set don't take duplicate values

        for (Integer i: set) {
            System.out.println(i);
        }
    }
}
