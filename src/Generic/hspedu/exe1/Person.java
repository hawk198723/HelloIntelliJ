package Generic.hspedu.exe1;

public class Person<E> {
    E s;

    public Person(E s) {
        this.s = s;
    }

    public void setS(E s) {
        this.s = s;
    }

    public E getS() {
        System.out.println(s);
        return s;
    }

    public void show(){
        System.out.println(s.getClass());
    }
}
