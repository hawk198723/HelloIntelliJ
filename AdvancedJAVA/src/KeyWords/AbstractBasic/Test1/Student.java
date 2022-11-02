package KeyWords.AbstractBasic.Test1;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

//    @Override
//    public void eat() {
//        System.out.println("Student eat");
//    }

    @Override
    public void breath() {
        System.out.println("Student breath");
    }
}
