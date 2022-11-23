package Collections.MapExe.TreeMap;

import org.junit.Test;

import java.util.*;

public class TreeMapTest {
    @Test
    // natural comparator with name
    public void test1(){
        TreeMap map = new TreeMap();
        Person p1 = new Person("Tim",23);
        Person p2 = new Person("Jim",25);
        Person p3 = new Person("Kim",35);
        Person p4 = new Person("Lim",45);

        map.put(p1, 78);
        map.put(p2, 98);
        map.put(p3, 58);
        map.put(p4, 69);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }

    @Test
    // custom comparator with age
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1= (Person) o1;
                    Person p2= (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }
                throw new RuntimeException("doesn't match");
            }
        });
        Person p1 = new Person("Tim",23);
        Person p2 = new Person("Jim",25);
        Person p3 = new Person("Kim",35);
        Person p4 = new Person("Lim",45);

        map.put(p1, 78);
        map.put(p2, 98);
        map.put(p3, 58);
        map.put(p4, 69);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }
    }


}
