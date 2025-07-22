package com.example.demo.test;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterUtil {

    // key: 自定义限流标识，比如方法名、业务名，value: RateLimiter 实例
    private static final Map<String, RateLimiter> limiterMap = new ConcurrentHashMap<>();

    /**
     * 获取一个限流器（可复用），支持每 N 秒允许一个请求
     * @param key 限流器唯一标识（每个业务不同）
     * @param secondsInterval 每隔多少秒允许一个请求（例如 6 秒）
     * @return RateLimiter 实例
     */
    public static RateLimiter getRateLimiter(String key, double secondsInterval) {
        return limiterMap.computeIfAbsent(key, k -> RateLimiter.create(1.0 / secondsInterval));
    }

    /**
     * 执行限流（阻塞直到可用）
     * @param key 限流器唯一标识
     * @param secondsInterval 限流间隔（秒）
     */
    public static void acquire(String key, double secondsInterval) {
        RateLimiter limiter = getRateLimiter(key, secondsInterval);
        limiter.acquire();
    }
}
