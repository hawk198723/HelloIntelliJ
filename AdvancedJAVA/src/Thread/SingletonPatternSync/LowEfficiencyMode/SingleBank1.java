package Thread.SingletonPatternSync.LowEfficiencyMode;

public class SingleBank1 {
    private SingleBank1(){
    }

    private static SingleBank1 instance = null;

    public static SingleBank1 getInstance(){
        synchronized (SingleBank1.class){
            if (instance == null) {
                instance = new SingleBank1();
            }

            return instance;
        }
    }

    public void showSomething(){
        System.out.println("Hi... World...");
    }
}
