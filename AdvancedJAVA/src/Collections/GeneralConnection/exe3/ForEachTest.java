package Collections.GeneralConnection.exe3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachTest {

    @Test
    public void test1(){
        Collection collection = new ArrayList();

        collection.add(123);
        collection.add(456);
        collection.add("Tom");
        collection.add("jason");

        for (Object object : collection){
            System.out.println(object);
        }
    }

    @Test
    public void test2(){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};

        for (int i : array){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        String[] strings = new String[]{"MM","MM","MM"};

//        for (int i = 0; i < strings.length; i++) {
//            strings[i] = "GG";   //this method will change the original value of the array
//        }


        for(String string: strings){
            string = "GG";    // this method won't change the original value of the array because you create a new string in the foreach
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
