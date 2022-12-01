package JAVA8.FunctionalInterface.PredicateExe;

import java.util.function.Predicate;

public class PredicateExe1 {

    public static void main(String[] args) {
        int[] nums = {34,45,56,766,34,67,78,36,60};
//        List<Integer> nums1 = Arrays.asList(34,45,56,766,34,67,78,36,60);

        Predicate<Integer> p1 = integer -> integer%2 == 0;
        Predicate<Integer> p2 = integer -> integer > 50;
        System.out.println("The numbers which are even and greater than 50 are: ");

        for (int num: nums) {
            if (p1.and(p2).test(num)) {
                System.out.println(num);
            }
        }

//        Consumer<Integer> consumer = n-> System.out.println(n);

//        nums1.forEach(n-> System.out.println(p1.and(p2).test(n)));
    }



}
