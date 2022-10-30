package OOP.Polymorphism;

public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest animalTest1 = new AnimalTest();
        Dog dog = new Dog();
        animalTest1.func(dog);

        animalTest1.func(new Cat());

    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}
