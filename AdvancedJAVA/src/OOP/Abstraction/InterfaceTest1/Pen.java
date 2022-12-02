package OOP.Abstraction.InterfaceTest1;

public class Pen extends Painter implements Writer, Drawer {
    public void write(){
        System.out.println("I can use pen to write");
    }

    @Override
    public void draw() {
        System.out.println("I can use pen to draw");
    }
}
