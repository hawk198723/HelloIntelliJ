package Collections.GeneralConnection.Set.TreeSet;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet treeSet = new TreeSet();

//        treeSet.add(123);
//        treeSet.add(-45);
//        treeSet.add(444);
//        treeSet.add(11);
//        treeSet.add(9999);

        treeSet.add(new Person("JEFF", 66));
        treeSet.add(new Person("JASON", 77));
        treeSet.add(new Person("AARON", 22));
        treeSet.add(new Person("BRIAN", 88));
        treeSet.add(new Person("TRUMP", 74));
        treeSet.add(new Person("TRUMP", 70));


        System.out.println(treeSet);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
