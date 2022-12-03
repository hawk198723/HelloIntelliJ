package Collections.GeneralConnection.Collection.exe9CoparableInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23,"Jason",88));
        students.add(new Student(15,"Hilo",69));
        students.add(new Student(9,"Gala",55));
        students.add(new Student(5,"Lily",99));

        Collections.sort(students);
//        Collections.sort(students,(o1, o2) -> o1.rollno>o2.rollno?1:-1);

        for(Student student: students){
            System.out.println(student);
        }
    }
}
