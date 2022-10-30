package Thread.ThreadGroup;

public class ThreadGroupTest {

    private  volatile  int var = 5;

    public static void main(String[] args) {

//        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
//        System.out.println(Thread.currentThread().getThreadGroup().getParent());

        ThreadGroup g = new ThreadGroup("Jason");
        System.out.println(Thread.currentThread().getThreadGroup().getParent());
        System.out.println(g.getName());

        ThreadGroup g1 = new ThreadGroup(g, "Child Group");
        System.out.println(Thread.currentThread().getThreadGroup().getParent());
        System.out.println(g1.getName());


        g.list();

        System.out.println("ThreadGroup g's active GroupCount is: " + g.activeGroupCount());
        System.out.println("Sub ThreadGroup g1's active GroupCount is: " + g1.activeGroupCount());



        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        System.out.println(system.activeCount());

        Thread[] t = new Thread[system.activeCount()];
        system.enumerate(t);
        for (Thread t1: t){
            System.out.println(t1.getName() + "................."+ t1.isDaemon());
        }
    }
}
