package JAVA8.FunctionalInterface.BiSeries.BiConsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();

        populate(arrayList);

        BiConsumer<Employee, Double> biConsumer = ((employee, aDouble) -> employee.salary = employee.salary + aDouble);
        for (Employee emp: arrayList) {
            biConsumer.accept(emp, 500.0);
            System.out.println("Employee Name: " + emp.name +"; Salary: "+ emp.salary);
        }
    }

    public static void populate(ArrayList<Employee> arrayList){
        arrayList.add(new Employee("Jason", 1000.0));
        arrayList.add(new Employee("Bryan", 1200.0));
        arrayList.add(new Employee("Villa", 1600.0));
        arrayList.add(new Employee("Frank", 2400.0));
    }
}
