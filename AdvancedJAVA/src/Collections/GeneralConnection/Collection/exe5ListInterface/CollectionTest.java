package Collections.GeneralConnection.Collection.exe5ListInterface;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List collection = new ArrayList();
        collection.add(4);// == Integer i = new Interger(4);
        collection.add(6);
        collection.add(8);
        collection.add(0,2);

//        for (Object i: collection) {
//            System.out.println(i);
//        }
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }
}
