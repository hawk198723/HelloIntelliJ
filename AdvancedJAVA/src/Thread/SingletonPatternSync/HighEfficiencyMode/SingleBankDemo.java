package Thread.SingletonPatternSync.HighEfficiencyMode;

public class SingleBankDemo {
    public static void main(String[] args) {
        SingleBank obj = SingleBank.getInstance();
        obj.show();
    }
}
