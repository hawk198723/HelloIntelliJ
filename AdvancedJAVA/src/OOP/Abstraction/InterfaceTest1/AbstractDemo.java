package OOP.Abstraction.InterfaceTest1;

public class AbstractDemo {
    public static void main(String[] args) {
        Kit kit = new Kit();
        Writer p = new Pen();
        Writer pc = new Pencil();
        Drawer drawer = new Pen();
        Pen pen = new Pen();

        kit.doSomething(p);
        kit.doSomething(pc);
        kit.doDraw(drawer);
        drawer.draw();
        pen.paint();
    }
}
