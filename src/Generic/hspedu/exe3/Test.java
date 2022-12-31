package Generic.hspedu.exe3;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> objects = new ArrayList<>();

        objects.add( new Employee("Jason",34444,new MyDate(12,11,2002)));
        objects.add( new Employee("Jonna",10000,new MyDate(11,02,1990)));
        objects.add( new Employee("Aason",60000,new MyDate(31,10,2002)));


        System.out.println("\nBefore filtering " + "employees" + objects );

        objects.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("emp info doesn't match!");
                    return 0;
                }

                int resultName = emp1.getName().compareTo(emp2.getName());
                if(resultName != 0){
                    return resultName;
                }

                int resultSalary = emp1.getSal()-emp2.getSal();
                if(resultSalary != 0){
                    return resultSalary;
                }

                int resultBirthday = emp1.getBirthday().compareTo(emp2.getBirthday());
                return resultBirthday;
            }
        });
        System.out.println("\nAfter filtering " + "employees" + objects );
    }
}

