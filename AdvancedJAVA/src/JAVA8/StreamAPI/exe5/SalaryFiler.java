package JAVA8.StreamAPI.exe5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SalaryFiler {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Jason", 50000.00));
        employees.add(new Employee("Kobe", 44444.00));
        employees.add(new Employee("Liam", 66666.00));
        employees.add(new Employee("Jose", 77770.00));
        employees.add(new Employee("Duke", 99999.00));

        Comparator<Employee> salaryFilter = (s1, s2)-> Double.compare(s1.getSalary(), s2.getSalary());
        Comparator<Employee> salaryFilter1 = (s1, s2)-> Double.compare(s1.salary, s2.salary);

//       employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
       employees.sort(salaryFilter);

       Consumer<Employee> consumer = n -> System.out.println(n.getName()+": "+n.getSalary());
       employees.forEach(consumer);
    }
}
