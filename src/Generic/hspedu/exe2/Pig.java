package Generic.hspedu.exe2;

public class Pig <E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }

    public void f(){
        System.out.println(e.getClass());
    }
}
