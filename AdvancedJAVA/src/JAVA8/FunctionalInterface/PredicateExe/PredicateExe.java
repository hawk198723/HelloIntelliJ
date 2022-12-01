package JAVA8.FunctionalInterface.PredicateExe;

import java.util.function.Predicate;

public class PredicateExe {
    public static void main(String[] args) {
        int array[] = {10, 16, 30 , 46, 75, 90};

        Predicate<Integer> pre1 = i -> i % 3 == 0;
        Predicate<Integer> pre2 = i -> i % 5 == 0;

        for (int arr: array) {
            if(pre1.or(pre2).test(arr)){
                System.out.println(arr);
            }
        }
    }
}
