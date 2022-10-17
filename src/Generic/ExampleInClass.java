package Generic;

import java.util.List;

public class ExampleInClass {
    public void show(List<?> l){
        String[] c = {"a","b","c"};
//        l.add(10);// not valid
//        l.add("Jason"); // not valid
        l.add(null);
    }
}
