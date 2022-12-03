package Collections.GeneralConnection.Collection.exe9CoparableInterface;

public class Student implements Comparable<Student> {
    int rollno, marks;
    String name;

    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student student){
        return marks>student.marks?1:-1;
    }
}
