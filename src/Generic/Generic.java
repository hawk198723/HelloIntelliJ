package Generic;

import java.util.ArrayList;

public class Generic  <T extends Number>{
    T value;
    Generic(T ob){
        this.value = ob;
    }
    public void show(){
        String[] c = {"a","b","c"};
        ArrayList list = new ArrayList();
        list.add(c);

        System.out.println("the type of ob is" + value.getClass().getCanonicalName());
    }

    public T getValue() {
        return value;
    }

}
