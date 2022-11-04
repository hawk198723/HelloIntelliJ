package KeyWords.AbstractBasic.Test2;

public class MainTest {
    public static void main(String[] args) {
        CommonEmployee c1 = new CommonEmployee();
        c1.setId(2);
        c1.setName("John");
        c1.setSalary(2000.0);
        c1.work();

        System.out.println(c1.getName() + " " + c1.getId() + " $" + c1.getSalary());

        Manager m1 = new Manager(500);
        m1.setId(1);
        m1.setName("Sara");
        m1.setSalary(5000.0);
        m1.work();

        Employee m2 = new Manager("Holy", 3,4000.0,60);

        System.out.println(m1.getName() + " " + m1.getId() + " $" + m1.getSalary());
        System.out.println(m2.getName() + " " + m2.getId() + " $" + m2.getSalary());
    }
}
