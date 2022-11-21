package Collections.GeneralConnection.List.ListMethodTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMethodTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(555);
        list.add(new Person("jason", 777));
        list.add(555);
        list.add("aaa");

        System.out.println(list);

        list.add(1, "BB");
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);// compare with list.add(list1);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.indexOf(555));
        System.out.println(list.indexOf(666));
        System.out.println(list.lastIndexOf(555));

        list.remove(4);
        System.out.println(list);

        list.set(1,"CC");
        System.out.println(list);

        System.out.println(list.subList(1, 4));


        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(("---------------1"));
        for(Object obj: list){
            System.out.println(obj);
        }
        System.out.println(("---------------2"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
