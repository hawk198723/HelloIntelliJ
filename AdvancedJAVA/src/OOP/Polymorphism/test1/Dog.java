package OOP.Polymorphism.test1;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats dog food.");
    }

    @Override
    public void shout() {
        System.out.println("Woof! Woof! Woof!");
    }

    public void doorKeep(){
        System.out.println("Gate Guarding...");
    }
}
