package com.example.demo.test;

import com.google.common.util.concurrent.RateLimiter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.test
 * @date 2025/7/2 22:36
 */
public class Test2 {
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        RateLimiter rateLimiter = RateLimiter.create(3);
        for (int index = 0; index < 10; index++) {
            //默认的方法，方法是阻塞的，获取到令牌前，会一直阻塞。领取一个令牌后返回阻塞的时间
            System.out.println(rateLimiter.acquire());
            handle(index);

            //指定超时时间，返回值为boolean型，即假设线程等待了指定时间后仍然没有获取到令牌，那么就会返回给客户端false
            if (rateLimiter.tryAcquire(200, TimeUnit.MILLISECONDS)) {
                handle(index);
            }
//            if (rateLimiter.acquire(1) > 0.0) {
//                handle(index);
//            }
        }
        System.out.println("run time:" + (System.currentTimeMillis() - start));
    }
    private static void handle(int i) {
        SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("获取到令牌：{" + i + "}=" + FORMATTER.format(new Date()));
    }
}
