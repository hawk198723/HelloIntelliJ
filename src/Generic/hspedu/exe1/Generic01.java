package Generic.hspedu.exe1;

public class Generic01 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("Jason");
        stringPerson.setS("walala");
        stringPerson.getS();
        stringPerson.show();

        PersonInteger<Integer> integerPersonInteger = new PersonInteger<>(33);
        integerPersonInteger.showType();

        PersonInteger<Object> objectPersonInteger = new PersonInteger<Object>(new String[]{"dfdf", "dfdf"});
        objectPersonInteger.setI(new String[]{"hahah", "dfdf"});
        objectPersonInteger.getI();
    }
}
