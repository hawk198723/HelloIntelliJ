package KeyWords.StaticBasic.Test1;

public class StaticTest {
    public static void main(String[] args) {

        American.nationality = "US";

        American a1 = new American();
        a1.name = "MJ";
        a1.age = 60;

        American a2 = new American();
        a2.name = "Lerbron James";
        a2.age =40;


        a1.nationality = "USA";

//        American.nationality = "US";

        System.out.println(a2.nationality);

//        American.name = "Joe Doe"; // cannot do that

        a1.eat();

        American.show();
//        American.eat(); //cannot do that
//        a2.info();
    }

}
