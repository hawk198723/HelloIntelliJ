package OOP.Polymorphism.test1;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void shout() {
        System.out.println("Meow! Meow! Meow");
    }
}
