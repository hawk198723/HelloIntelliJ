package Thread.SingletonPatternSync.HighEfficiencyMode;

public class SingleBank {
    private SingleBank(){
    }

    private static SingleBank instance = null;
    public static SingleBank getInstance(){
        if (instance == null) {
            synchronized (SingleBank.class){
                if (instance == null) {
                    instance = new SingleBank();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("Hello World !!!!!!! 123");
    }
}
