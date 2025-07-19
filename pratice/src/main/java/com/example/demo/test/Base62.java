package com.example.demo.test;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.test
 * @date 2025/7/13 18:12
 */
public class Base62 {
    private static final String CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(long num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.insert(0, CHARACTERS.charAt((int)(num % 62)));
            num /= 62;
        }
        return sb.toString(); // 自然长度（不补零）
    }

    public static void main(String[] args) {
        Long num = 3333666L;
        System.out.println(Base62.encode(num));
    }
}
