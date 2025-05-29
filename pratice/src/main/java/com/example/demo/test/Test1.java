package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Test1 {
    public static int getWeekNumOfDate(Date date) {
        int[] weekDays = {7, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0) {
            w = 0;
        }
        return weekDays[w];
    }

    public static void main(String[] args) {
//        Date nowDate = new Date();
//        int week = getWeekNumOfDate(nowDate);
//        System.out.println(week);
//        long seconds = System.currentTimeMillis() / 1000;
//        System.out.println("当前时间戳（秒）: " + seconds);
//
//        String callback = "http://tracking.e.qq.com/conv?cb=5kC-cNEVPRBPSN1ikuM8o6wCjYFVXTWjHgjY0vpDzjLX0DwvhohWyIkRObW23s-I";
//        String[] strings = callback.split("=");
//        String callBackUrl = strings[1];
//        System.out.println(callBackUrl);
//
//        Map<String, List<String>> headers = new HashMap<>();
//        headers.put("access-token", Collections.singletonList("ds"));
//        headers.put("timestamp", Collections.singletonList(String.valueOf(System.currentTimeMillis() / 1000)));
//        headers.put("nonce", Collections.singletonList(UUID.randomUUID().toString()));
//        System.out.println(headers);
//
//        System.out.println(getIPVersion("192.168.1.1"));      // IPv4
//        System.out.println(getIPVersion("2001:0db8:85a3::8a2e:0370:7334")); // IPv6
//        System.out.println(getIPVersion("invalid.ip"));       // Invalid IP

        // 模拟从前端接收到的数据（假设已经是 List<Integer>，如 [3, 2, 4]）
//        List<Integer> loanWeeks = Arrays.asList(3, 2, 4);
//        List<Integer> loanWeeks2 = null;
//
//        // 处理：排序
//        List<Integer> sortedLoanWeeks = new ArrayList<>(loanWeeks);
//        Collections.sort(loanWeeks);
//
//        System.out.println(StringUtils.join(loanWeeks, ","));
//        System.out.println(StringUtils.join(loanWeeks2, ","));
//
//        // 输出结果
//        System.out.println("排序后的loanWeeks: " + loanWeeks2);
//        System.out.println("排序后的loanWeeks: " + sortedLoanWeeks);
//
//        // 如需拼接成字符串（例如存数据库：2,3,4）
//        String resultStr = String.join(",",
//                sortedLoanWeeks.stream()
//                        .map(String::valueOf)
//                        .toArray(String[]::new)
//        );
//
//        System.out.println("拼接后的字符串: " + resultStr);
        AtomicReference<String> effectiveTimeListAtomic = new AtomicReference<>("");

        String kv = "a,b";
        // 线程安全地追加数据
        effectiveTimeListAtomic.getAndUpdate(prev -> prev + kv + "|");

        System.out.println(effectiveTimeListAtomic.get()); // 输出: a|b|c|d

        String callback = "http://tracking.e.qq.com/conv?cb=QhJk9Dh95PvNMBP9-nsgL0HBDRGIvMRDCQxvsD6Glm5s4KoM_RzN119FiPgIMXpM&conv_id=60367370";
        String[] strings = callback.split("\\?");
        String callBackUrl = strings[1];
        System.out.println(callBackUrl);
    }

    private List<Integer> sortedLoanWeeks(List<Integer> loanWeeks) {
        List<Integer> sortedLoanWeeks = new ArrayList<>(loanWeeks);
        return sortedLoanWeeks;
    }

    public static String getIPVersion(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            byte[] bytes = inetAddress.getAddress();

            if (bytes.length == 4) {
                return "IPv4";
            } else if (bytes.length == 16) {
                return "IPv6";
            } else {
                return "Unknown";
            }
        } catch (UnknownHostException e) {
            return "Invalid IP";
        }
    }
}
