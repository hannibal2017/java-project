package com.example.demo.concurrent;

import java.util.concurrent.*;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.concurrent
 * @date 2025/6/28 14:30
 */
public class TimeoutHttpCaller {

    private static final ExecutorService executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        Callable<String> task = new ThirdPartyCaller();
        Future<String> future = executor.submit(task);

        try {
            // 最多等待3秒
            String result = future.get(3, TimeUnit.SECONDS);
            System.out.println("调用成功，返回：" + result);
        } catch (TimeoutException e) {
            System.err.println("❌ 调用第三方接口超时！");
            future.cancel(true); // 中断任务
        } catch (ExecutionException e) {
            System.err.println("❌ 第三方接口调用异常：" + e.getCause());
        } catch (InterruptedException e) {
            System.err.println("⚠️ 当前线程被中断");
        } finally {
            // 不关闭线程池，作为公共资源。若整个项目用这个线程池则不能关闭
             executor.shutdown();
        }
    }
}
