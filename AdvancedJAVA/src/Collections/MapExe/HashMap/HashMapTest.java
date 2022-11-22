package Collections.MapExe.HashMap;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest {
    @Test
    public void test1(){
        Map map = new HashMap();

        map.put(null,12);
        map.put(null,null);
    }

    @Test
    public void test2(){
        Map map = new Hashtable();

        map.put(null,12);  // cannot do that
        map.put(null,null);// cannot do that
    }
}
