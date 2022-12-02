package OOP.Abstraction.DefaltMethodInInterface;
@FunctionalInterface  //1.8 can define method in interface
public interface What {
    void show();
    default void play(){
        System.out.println("Let's play!!!");
    }
}
