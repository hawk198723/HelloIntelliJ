package JAVA8.StreamAPI.exe3;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Jason");
        arrayList.add("Bryadfn");
        arrayList.add("Villasedsdsd");
        arrayList.add("Frank");
        arrayList.add("k");

        Comparator<String> byLength1 = (s1, s2) -> -s1.length() + s2.length();

        Collections.sort(arrayList, byLength1);
        System.out.println(arrayList);
        arrayList.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);
    }

}
