package Collections.GeneralConnection.Collection.exe1;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
            public void test1(){
        Collection collection = new ArrayList();

        collection.add("aa");
        collection.add("bb");
        collection.add(123);
        collection.add(new Date());
        collection.add(new Person("Joe",30 ));

        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add("ee");
        collection1.add(789);
        collection.addAll(collection1);

        System.out.println(collection.size());
        System.out.println(collection1.toString());
        System.out.println(collection);

        System.out.println(collection1.isEmpty());
        collection1.clear();
        System.out.println(collection1.isEmpty());
        System.out.println(collection1);

        boolean isContain = collection.contains(123);
        System.out.println("collection cotains 123? "+ isContain);
        System.out.println(collection.contains(new String("aa")));

        Person person = new Person("Doe", 22);
        collection.add(person);
        System.out.println(collection.contains(person)); //true

        collection.add(new Person("Tim", 35));
        System.out.println(collection);
        System.out.println("Tim in there?"+ collection.contains(new Person("Tim", 35))); // if person equals()method not override, it would be false

        //containsAll
        Collection collection2 = Arrays.asList("bb", 123);
        System.out.println(collection.containsAll(collection2));
    }

    @Test
    public void test2(){
        //remove
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(345);
        collection.add("aaa");
        collection.add(new Person("Jerry", 4));
        collection.add(new String("Tom"));

        collection.remove(123);
        System.out.println(collection);

        collection.remove(new Person("Jerry", 4));
        System.out.println(collection);

        //removeAll
        Collection collection1 = Arrays.asList(345,"aaa");
        collection.removeAll(collection1);
        System.out.println(collection);
    }

    @Test
    public void test3(){
        //remove
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(345);
        collection.add("aaa");
        collection.add(new Person("Jerry", 4));
        collection.add(new String("Tom"));

       //retainAll

        Collection collection1 = Arrays.asList(123, 666, "Tom");
        collection.retainAll(collection1);
        System.out.println(collection);
    }

    @Test
    public void test4(){
        //remove
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(345);
        collection.add(345);
        collection.add("aaa");
        collection.add(new Person("Jerry", 4));
        collection.add(new String("Tom"));
        System.out.println(collection);
        //euquals

        Collection collection1 = new ArrayList();
        collection1.add(123);
        collection1.add(345);
        collection1.add("aaa");
        collection1.add(new Person("Jerry", 4));
        collection1.add(new String("Tom"));

        System.out.println(collection.equals(collection1));
        //hashcode
        System.out.println(collection.hashCode());
        //toArray
        Object[] array = collection.toArray();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

        //asList
        List<String> list = Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123,345});
        System.out.println(arr1);
        System.out.println(arr1.size());

        List arr2 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2);
        System.out.println(arr2.size());

    }

}
