package KeyWords.StaticBasic.Test2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(4.0);

        System.out.println("c1's ID: " +  c1.getId());
        System.out.println("c2's ID: " +  c2.getId());
        System.out.println("c3's ID: " +  c3.getId() + ",radius is " + c3.getRadius() + " ,and the area is: " + c3.CalculateArea());
        System.out.println("Total number of Circle is: " + Circle.getTotal());
    }
}
