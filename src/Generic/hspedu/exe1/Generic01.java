package Generic.hspedu.exe1;

public class Generic01 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("Jason");
        stringPerson.setS("walala");
        stringPerson.getS();
        stringPerson.show();
    }
}
