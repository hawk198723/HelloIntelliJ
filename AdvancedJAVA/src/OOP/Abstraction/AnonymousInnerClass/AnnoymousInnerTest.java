package OOP.Abstraction.AnonymousInnerClass;


class A{
    public void show(){
        System.out.println("It's a show method.");
    }
}
public class AnnoymousInnerTest {
    public static void main(String[] args) {
        A obj = new A(){
                    public void show(){
                        System.out.println("It's inner show method.");
                    }
        };

        obj.show();
    }
}
