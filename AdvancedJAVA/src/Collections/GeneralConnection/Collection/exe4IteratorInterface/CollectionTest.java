package Collections.GeneralConnection.Collection.exe4IteratorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(4);
        collection.add(6);
        collection.add(8);

        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
