package Collections.GeneralConnection.exe2;

import Collections.GeneralConnection.exe1.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test1() {
        Collection collection = new ArrayList();

        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());
        collection.add(new Person("Joe", 30));

        Iterator iterator = collection.iterator();

//        // way 1
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//
//        System.out.println(iterator.next());//java.util.NoSuchElementException
// way 2 not recommended
//        for (int i = 0; i < collection.size() ; i++) {
//            System.out.println(iterator.next());
//        }

        //way 3 recommended
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Collection collection1 = new ArrayList();

        collection1.add("aa");
        collection1.add("bb");
        collection1.add("Tom");
        collection1.add(123);
        collection1.add(new Person("Jaosn",34));

        Iterator iterator1 = collection1.iterator();
        while(iterator1.hasNext()){
//            iterator1.remove();//java.lang.IllegalStateException
            Object object = iterator1.next();
            if ("Tom".equals(object)){
                iterator1.remove();
//                iterator1.remove();//java.lang.IllegalStateException will be created if you call remove one more time after you called earlier
            }
//            System.out.println(iterator1.next());
        }
        iterator1 = collection1.iterator();// you have to create another iterator here
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

}