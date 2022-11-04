package Threads.Runnable;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + " -> " + i);
                // let thread sleep
                Thread.sleep(3000);
            }
        }catch (Exception e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }

        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

//        while (true){
//            Thread t = new Thread(this, threadName);
//            t.start ();
//        }

        if (t == null) {
            Thread t = new Thread (this, threadName);
            t.start ();
            t.setName("Wahllah!");
            System.out.println(t.getName());
        }
    }
}
