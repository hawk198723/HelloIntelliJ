package Collections.GeneralConnection.Set.HashSet.LinkedHashSet;

import Collections.GeneralConnection.Set.HashSet.HashSetExe.Person;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    @Test
    public void test1(){
        Set set = new LinkedHashSet();
        set.add("111");
        set.add("AA");
        set.add("BB");
        set.add(123);
        set.add(123);
        set.add(444);
        set.add(new Person("JASON", 777));
        set.add(new Person("JASON", 777));

        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
