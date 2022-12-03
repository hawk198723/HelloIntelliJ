package Collections.GeneralConnection.Collection.exe8ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>(); //list is default mutable
        collection.add(404);// == Integer i = new Interger(4);
        collection.add(207);
        collection.add(509);
        collection.add(303);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1%100 >o2%100) {
//                    return 1;
//                }else {
//                    return -1;
//                }
                return o1%100>o2%100?1:-1;
            }
        };

        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1%100>o2%100?1:-1;
            }
        };

        Comparator<Integer> c2 = (o1, o2)-> o1%100>o2%100?1:-1;

        Collections.sort(collection, c);

        for (Integer o: collection) {
            System.out.println(o);
        }
    }
}
