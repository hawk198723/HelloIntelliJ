package Thread.SingletonPatternSync.LowEfficiencyMode;

public class SingleBankDemo1 {
    public static void main(String[] args) {
        SingleBank1 obj = SingleBank1.getInstance();
        obj.showSomething();
    }
}
