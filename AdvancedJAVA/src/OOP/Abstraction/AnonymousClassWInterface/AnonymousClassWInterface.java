package OOP.Abstraction.AnonymousClassWInterface;

//class Implimentor implements Abc{
//    @Override
//    public void show() {
//        System.out.println("Anything");
//    }
//}
public class AnonymousClassWInterface {
    public static void main(String[] args) {
        Abc obj = () -> System.out.println("Anything");

        obj.show();
    }
}
