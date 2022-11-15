package JAVAClasses.ComparableAndComparator.exe1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

    @Test //comparable String -- natural compare  --> override compareTo() method in the Goods Class
    public void test1(){
        String[] arr = new String[]{"AA", "BB", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test // custom class comparable  --  natural compare  --> override compareTo() method in the Goods Class
    public void test2(){

        Goods[] arr = new Goods[4];
        arr[0] = new Goods("Lenovo", 100);
        arr[1] = new Goods("IBM", 600);
        arr[2] = new Goods("MacBookPro", 2000);
        arr[3] = new Goods("Chrombook", 100);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    @Test //String Comparator -- custom compare  --> override compare() method  (temporary)
    public void test3(){
        String[] arr = new String[]{"AA", "BB", "KK", "ZZ", "PP", "JJ", "CC"};

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arr));
    }


    @Test // custom comparator -- custom compare  --> override compare() method  (temporary)
    public void test4(){
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("Lenovo", 100);
        arr[1] = new Goods("IBM", 600);
        arr[2] = new Goods("MacBookPro", 2000);
        arr[3] = new Goods("Chrombook", 100);
        arr[4] = new Goods("Chrombook", 20);

        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName().equals(o2.getName())){
                    return  Double.compare(o1.getPrice(), o2.getPrice()); // cheaper first
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
