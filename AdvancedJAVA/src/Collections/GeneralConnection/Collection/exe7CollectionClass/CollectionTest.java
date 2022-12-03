package Collections.GeneralConnection.Collection.exe7CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>(); //list is default mutable
        collection.add(404);// == Integer i = new Interger(4);
        collection.add(207);
        collection.add(509);
        collection.add(303);

        Collections.sort(collection);
        Collections.reverse(collection);
        Collections.shuffle(collection);
        for (Integer o: collection) {
            System.out.println(o);
        }
    }
}
