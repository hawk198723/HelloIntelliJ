package JAVA8.StreamAPI.exe4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Add some employees to the list
        employees.add(new Employee("John", 30));
        employees.add(new Employee("Jane", 28));
        employees.add(new Employee("Adam", 35));
        employees.add(new Employee("Tom", 25));
        employees.add(new Employee("Sara", 29));

        // Sort the list of employees on the basis of their name length in descending order
        Collections.sort(employees, (Employee e1, Employee e2) -> {
            return Integer.compare(e2.getName().length(), e1.getName().length());
        });

        // Print out the employees whose name starts with letter J
        employees.forEach(e -> {
            if (e.getName().startsWith("J")) {
                System.out.println(e.getName() + ": " + e.getAge());
            }
        });
    }
}