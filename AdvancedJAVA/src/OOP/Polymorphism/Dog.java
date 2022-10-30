package OOP.Polymorphism;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats dog food.");
    }

    @Override
    public void shout() {
        System.out.println("Woof! Woof! Woof!");
    }
}
