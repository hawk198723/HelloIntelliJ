package Collections.GeneralConnection.Collection.exe6GernericsWithList;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<Integer>();
        collection.add(4);// == Integer i = new Interger(4);
        collection.add(6);
        collection.add(8);
//        collection.add(0,2);

        for (Integer i: collection) {
            System.out.println(i);
        }
        for (Object i: collection) { //Object works too, but Integer is better
            System.out.println(i);
        }
    }
}
