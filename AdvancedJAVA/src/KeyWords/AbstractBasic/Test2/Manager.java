package KeyWords.AbstractBasic.Test2;

public class Manager extends Employee{

    private double bonus = 0;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        bonus++;
        System.out.println("Manager working get bonus $" + bonus);
    }
}
