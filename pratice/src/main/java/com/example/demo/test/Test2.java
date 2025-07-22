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
        for (int i = 0; i < 5; i++) {
            RateLimiterUtil.acquire("doJob", 6);
        }
//        Long start = System.currentTimeMillis();
//        RateLimiter rateLimiter = RateLimiter.create(1.0 / 6);
//        for (int i = 0; i < 5; i++) {
//            if (rateLimiter.tryAcquire()) {
//                System.out.println(i + "获取到令牌");
//            } else {
//                System.out.println(i + "获取不到令牌");
//            }
//        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
////        for (int index = 0; index < 10; index++) {
////            //默认的方法，方法是阻塞的，获取到令牌前，会一直阻塞。领取一个令牌后返回阻塞的时间
//////            System.out.println(rateLimiter.acquire());
//////            handle(index);
////
////            //指定超时时间，返回值为boolean型，即假设线程等待了指定时间后仍然没有获取到令牌，那么就会返回给客户端false
////            if (rateLimiter.tryAcquire()) {
////                handle(index);
////            }else {
////                System.out.println(index + "获取不到令牌");
////            }
////            try {
////                Thread.sleep(3000);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//////            if (rateLimiter.acquire(1) > 0.0) {
//////                handle(index);
//////            }
////        }
//        System.out.println("run time:" + (System.currentTimeMillis() - start));
    }

    private static void handle(int i) {
        SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("获取到令牌：{" + i + "}=" + FORMATTER.format(new Date()));
    }
}
