package Threads.Callable;

import java.util.concurrent.Callable;

public class NumThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum =0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2== 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
