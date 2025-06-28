package com.example.demo.concurrent;

import org.springframework.util.StopWatch;

import java.util.concurrent.Callable;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.concurrent
 * @date 2025/6/28 14:30
 */
public class ThirdPartyCaller implements Callable<String> {
    @Override
    public String call() throws Exception {
        // 假设这是第三方API调用，可能很慢
        System.out.println("开始调用第三方接口...");
        StopWatch sw = new StopWatch();
        sw.start();
        sw.stop();
        System.out.println("耗时:" + sw.getTotalTimeMillis());
        sw.start();
        Thread.sleep(500);
        sw.stop();
        System.out.println("耗时:" + sw.getTotalTimeSeconds());

        // 示例：模拟接口耗时
        Thread.sleep(4000); // 超过3秒，模拟慢请求

        return "第三方返回结果";
    }
}
