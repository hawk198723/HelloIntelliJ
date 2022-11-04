package Threads.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(numThread);

//        Thread IamThreadObj = new Thread(futureTask);
//
//        IamThreadObj.start();
new Thread(futureTask).start();

        try {
            Integer sum = futureTask.get();
            System.out.println("Sum is : "+ sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
