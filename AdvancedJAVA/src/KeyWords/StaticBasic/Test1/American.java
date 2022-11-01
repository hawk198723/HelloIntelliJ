package KeyWords.StaticBasic.Test1;

public class American {
    String name;
    int age;
    static String nationality;

    public void eat(){
        System.out.println("I love BigMc!");
        info(); // ==> this.info();
        System.out.println("name-->" + name);
        laugh();
        System.out.println("nationality:" + nationality);
    }

    public static void show(){
        System.out.print("I love dunk !!");
        laugh();
//        eat();//no no no  ==> this.eat();  nor super.eat()
//        name="Tom"; //no no no
        System.out.println(nationality); // ==> American.nationality
    }

    public void info(){
        System.out.println("name:" + name + ", age:" + age);
    }

    public static void laugh(){
        System.out.println(" Loooool");
    }
}
