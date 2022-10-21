package Threads;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList stringArrayList = new ArrayList();
        stringArrayList.add("a");
        stringArrayList.add("b");
        action(stringArrayList);
    }

    public static void action(ArrayList<Object> item){
        for(Object o: item){
            System.out.println("hahaha");
        }
    }
//    public static void action(ArrayList<?> item){
//        for(Object o: item){
//            System.out.println("hahaha");
//        }
//    }
}
