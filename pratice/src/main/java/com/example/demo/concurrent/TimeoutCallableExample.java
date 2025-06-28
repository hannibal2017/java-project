package com.example.demo.concurrent;

import java.util.concurrent.*;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.concurrent
 * @date 2025/6/28 14:05
 */
public class TimeoutCallableExample {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // 定义一个 Callable 任务
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("任务开始执行...");
                Thread.sleep(2000); // 模拟耗时操作 > 3 秒
                return "任务执行完成";
            }
        };

        // 提交任务
        Future<String> future = executor.submit(task);

        try {
            // 设置最大执行时间为 3 秒
            String result = future.get(3, TimeUnit.SECONDS);
            System.out.println("任务返回结果: " + result);
        } catch (TimeoutException e) {
            System.err.println("任务执行超时！");
            // 可选择取消任务
            future.cancel(true);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("任务执行异常: " + e.getMessage());
        } finally {
            executor.shutdown();
        }
    }
}
