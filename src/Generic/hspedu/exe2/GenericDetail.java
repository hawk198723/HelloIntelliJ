package Generic.hspedu.exe2;

import java.util.ArrayList;
import java.util.List;

public class GenericDetail {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>();


        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> bPig = new Pig<A>(new B());
        bPig.f();


        ArrayList arrayList1 = new ArrayList();// ArrayList<Object> arrayList1 = new ArrayList<Object>();
        ArrayList<Pig> pigs = new ArrayList<>();




    }
}
