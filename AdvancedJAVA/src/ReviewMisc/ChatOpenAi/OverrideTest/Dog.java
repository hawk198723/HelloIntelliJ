package ReviewMisc.ChatOpenAi.OverrideTest;

public class Dog extends Animal {
    public void move() {
        super.move();
        System.out.println("Dogs can walk and run");
    }
}

/*

In this example, the move() method in the Dog class is an override method, but it does not include a call to the move() method of the Animal class using the super keyword. As a result, the behavior of the Animal class method is not preserved, and the move() method of the Dog class will simply print the message "Dogs can walk and run" to the console when it is called.

It is generally a good practice to include a call to the superclass method in an override method, as it allows you to extend or modify the behavior of the superclass method while still preserving its original behavior. However, there may be cases where you want to completely replace the behavior of the superclass method, in which case you can omit the call to the superclass method.
 */