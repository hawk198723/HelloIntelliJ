package Threads.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
//        System.out.println(service.getClass());
//        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime(5000L,MILLISECONDS);

        service.execute(new NumberThread());// fit Runnable
//        service.execute(new NumberThread1());// fit Runnable
        service.submit(new NumberThread1());// fit Callable

        service.shutdown();
    }
}
