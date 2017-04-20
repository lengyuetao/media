package com.tao.threads;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by zhangantao on 2017/4/17.
 * 多线程并行计算future模式
 */
public class CallableFutureTest {

    public static void main(String[] args) {
        ExecutorService pool= Executors.newSingleThreadExecutor();

        Future<Integer> future=pool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });

        try {
            Thread.sleep(5000);
            System.out.println(future.get());
            pool.shutdown();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
