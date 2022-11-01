package KeyWords.StaticBasic.Test2;

public class Circle {
    private double radius;
    private int id;


    private static int total;
    private static int init = 1001;

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
//        id = init++; //can be replaced by this().
//        total++;
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
    public double CalculateArea(){
        return 3.14 * radius * radius;
    }



}
