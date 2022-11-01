package OOP.Inheritance.EqualEqualSignTest;

public class EqualSignTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d =10.0;
        System.out.println(i == j); //true
        System.out.println(i == d); //true

        boolean b = true;
//        System.out.println(i == b);

        char c = 10;
        System.out.println(i == c); // true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2); //  true  ASCII code?

    }
}
