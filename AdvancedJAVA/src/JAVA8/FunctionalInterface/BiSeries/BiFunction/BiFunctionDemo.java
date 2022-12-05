package JAVA8.FunctionalInterface.BiSeries.BiFunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();

        BiFunction<String, Integer, Employee> biFunction = (s, integer) -> new Employee(s, integer);
        Employee employee = biFunction.apply("Jason", 101);
        Employee employee1 = biFunction.apply("Noah", 103);

        System.out.println(employee.toString());
        System.out.println(employee1.toString());
    }


}
