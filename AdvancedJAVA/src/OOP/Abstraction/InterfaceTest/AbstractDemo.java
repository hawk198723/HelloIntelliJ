package OOP.Abstraction.InterfaceTest;

public class AbstractDemo {
    public static void main(String[] args) {
        Kit kit = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();

        kit.doSomething(p);
        kit.doSomething(pc);
    }
}
