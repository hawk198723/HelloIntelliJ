package Collections.MapExe.HashMap.LinkedHashMap;

import org.junit.Test;

import java.util.*;

public class LinkedHashMapTest {
    @Test
    public void test1(){
        Map map = new HashMap();

        map.put(123,"AA");
        map.put(456,"BB");
        map.put(789,"CC");

        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new LinkedHashMap();

        map.put(123,"AA");
        map.put(456,"BB");
        map.put(789,"CC");

        System.out.println(map);
    }
// basic Map method, new --> put , update -->put also, delete--> remove
    @Test
    public void mapMethods(){
        Map map = new HashMap();

        map.put("Jason",1);
        map.put("Erik",2);
        map.put("Jason",3);
        map.put("Joey",1);
        map.put("Erik",3);
        map.put("Joey",0);
        map.put("David",4);
        map.put("Ruihan",4);

        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("AA",88);
        map1.put("BB",77);
        map1.put("Ruihan",9);

        map.putAll(map1);
        System.out.println(map);

        Object v = map.remove("Ruihan");
        Object v1 = map.remove("Ruihan1");
        System.out.println(v);
        System.out.println(v1);
        System.out.println(map);
        System.out.println(map.size());

        map.clear();  // different with map = null
//        map = null;
        System.out.println(map.size());
        System.out.println(map);
    }

    @Test
    public void mapSearchMethods() {
        Map map = new HashMap();

        map.put("Jason", 1);
        map.put("Erik", 2);
        map.put("Jason", 3);
        map.put("Joey", 1);
        map.put("Erik", 3);
        map.put("Joey", 0);
        map.put("David", 4);
        map.put("Ruihan", 4);

        System.out.println(map);

        System.out.println(map.get("Jason"));
        System.out.println(map.containsKey("Joey"));
        System.out.println(map.containsValue(4));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
//        map.clear();
//        System.out.println(map.isEmpty());
        Map map1 = new HashMap();
        map1.put("Jason", 1);
        map1.put("Erik", 2);
        map1.put("Jason", 3);
        map1.put("Joey", 1);
        map1.put("Erik", 3);
        map1.put("Joey", 0);
        map1.put("David", 4);
        map1.put("Ruihan", 4);

        System.out.println(map.equals(map1));
    }

    @Test
    public void mapIteratorMethods() {
        Map map = new HashMap();

        map.put("Jason", 1);
        map.put("Erik", 2);
        map.put("Jason", 3);
        map.put("Joey", 1);
        map.put("Erik", 3);
        map.put("Joey", 0);
        map.put("David", 4);
        map.put("Ruihan", 4);

        System.out.println(map);

        System.out.println(map.keySet());
//keySet
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " -->" + iterator);
        }
//Values
        Collection values = map.values();
        for (Object obj: values){
            System.out.println(obj);
        }

        for (Object value : map.values()) {
            System.out.println(value);
        }

//entrySet
        //way1
        Set set = map.entrySet();
        Iterator iterator1 =  set.iterator();
        while(iterator1.hasNext()){
            Object obj1 = iterator1.next();
//            System.out.println(obj1);
            Map.Entry entry = (Map.Entry) obj1;
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("##########################");

        //way 2
        Iterator keySetIterator = map.keySet().iterator();
        while (keySetIterator.hasNext()){
            Object key = keySetIterator.next();
            Object value = map.get(key);
            System.out.println(key + " --> " + value);
        }
    }
}
