package Collections.GeneralConnection.Collection.exe11MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("myname","Jason");
        map.put("CEO","Tim");
        map.put("actor","Josh");

        System.out.println(map.get("myname"));

        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key +" "+map.get(key));
        }
    }
}
