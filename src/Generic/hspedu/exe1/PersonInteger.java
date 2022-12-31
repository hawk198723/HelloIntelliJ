package Generic.hspedu.exe1;

public class PersonInteger<T> {
    T i;

    public T getI() {
        System.out.println(i);
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }

    public PersonInteger(T i) {
        this.i = i;
    }

    public void showType(){
        System.out.println(i.getClass());
    }
}
