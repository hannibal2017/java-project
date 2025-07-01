package com.example.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
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
//        AtomicReference<String> effectiveTimeListAtomic = new AtomicReference<>("");
//
//        String kv = "a,b";
//        // 线程安全地追加数据
//        effectiveTimeListAtomic.getAndUpdate(prev -> prev + kv + "|");
//
//        System.out.println(effectiveTimeListAtomic.get()); // 输出: a|b|c|d
//
//        String callback = "http://tracking.e.qq.com/conv?cb=QhJk9Dh95PvNMBP9-nsgL0HBDRGIvMRDCQxvsD6Glm5s4KoM_RzN119FiPgIMXpM&conv_id=60367370";
//        String[] strings = callback.split("\\?");
//        String callBackUrl = strings[1];
//        System.out.println(callBackUrl);
//
//        String channelCode = "txh5-2";
//        System.out.println(channelCode.contains("txh5"));
//        String timeStr = "2025-05-30 23:59:59";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse(timeStr, formatter);
//        long timestamp = localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
//
//        String phone = "13700001111";
//        System.out.println(phone.substring(0,8));
//        String original = "深圳市";
//        String result = original.replaceAll("[市].?", "");
//        System.out.println(result);
//// 输出: "这是一个示例字符串，包含一些中文字符"
//        System.out.println(String.valueOf(System.currentTimeMillis()));
        // 获取本机IP最后一段作为workerId
//        try {
//            String ip = InetAddress.getLocalHost().getHostAddress();
//            String[] segments = ip.split("\\.");
//            System.out.println(Long.parseLong(segments[3]) % 32);
//            int a = 4/0;
//        } catch (Exception e) {
//            try {
//                String hostname = InetAddress.getLocalHost().getHostName();
//                System.out.println(Math.abs(hostname.hashCode()) % 32);
//                System.out.println(ThreadLocalRandom.current().nextLong(32));
//                int a = 4/0;
//            } catch (UnknownHostException ex) {
//                System.out.println(ThreadLocalRandom.current().nextLong(32));
//            }
//        }
        String input = "13576684764\n" +
                "13418512651\n" +
                "13622169348\n" +
                "15718482106\n" +
                "18126429019\n" +
                "13607607683\n" +
                "13427934133\n" +
                "15626179713\n" +
                "13431431459\n" +
                "13340045130\n" +
                "15816763395\n" +
                "13798407141\n" +
                "13418652786";
//        System.out.println(generateToList(input));
        //换行的手机号码，转化为sql的in条件输出
        List<String> stringList = generateToList(input);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            sb.append("'").append(stringList.get(i)).append("'");
            if (i < stringList.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());

//        String inClause = generateInClause(input);
//        System.out.println(inClause);

        // 方法 1：split + Arrays.asList()
        String str = "{cl-wrb,ffff}";
        String content = str.substring(1, str.length() - 1);
        List<String> list = Arrays.asList(content.split(","));
        System.out.println(list);
        String org = "cl-wrsddb";
        System.out.println(list.contains(org));
//        System.out.println(13 / 52.00);
//        String jsonStr = "{\n" +
//                "  \"code\": 1,\n" +
//                "  \"msg\": \"ok\",\n" +
//                "  \"time\": \"1750298431\",\n" +
//                "  \"data\": {\n" +
//                "    \"exist_md5\": [\n" +
//                "      \"ac3117edfcc61e63bb41b1cdb47ccd77\"\n" +
//                "    ],\n" +
//                "    \"status\": 1,\n" +
//                "    \"check_no\": \"7e53949779982dab2d008da9f5401989\",\n" +
//                "    \"product\": {\n" +
//                "      \"price\": 15.1,\n" +
//                "      \"logo_img\": \"https:\\/\\/res-api.mmsrongxing.com\\/img\\/logo.jpg\",\n" +
//                "      \"organization_name\": \"融星贷\",\n" +
//                "      \"product_name\": \"融星贷\",\n" +
//                "      \"feat\": [\n" +
//                "        {\n" +
//                "          \"name\": \"用户注册服务协议\",\n" +
//                "          \"url\": \"http:\\/\\/loanhub-api.mmsrongxing.com\\/feat\\/userRegistrationServiceAgreement\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"name\": \"个人信息收集说明\",\n" +
//                "          \"url\": \"http:\\/\\/loanhub-api.mmsrongxing.com\\/feat\\/personalInfoCollectionStatement\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"name\": \"隐私政策\",\n" +
//                "          \"url\": \"http:\\/\\/loanhub-api.mmsrongxing.com\\/feat\\/privacyPolicy\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"name\": \"个人信息共享授权协议\",\n" +
//                "          \"url\": \"http:\\/\\/loanhub-api.mmsrongxing.com\\/feat\\/personalInfoSharingAuthAgreement\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "          \"name\": \"贷款知情书\",\n" +
//                "          \"url\": \"http:\\/\\/loanhub-api.mmsrongxing.com\\/feat\\/loanInformationLetter\"\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }\n" +
//                "}";
//
//        JSONObject jsonObject = JSON.parseObject(jsonStr);
//        JSONArray dataArray = jsonObject.getJSONObject("data").getJSONArray("exist_md5");
//
//        for (int i = 0; i < dataArray.size(); i++) {
//            String item = dataArray.getString(i);
//            System.out.println(item);
//        }
//        String md5 = "ac3117edfcc61e63bb41b1cdb47ccd77";
//        System.out.println(md5.toUpperCase());
//        System.out.println(dataArray.contains(md5.toLowerCase()));
//        String mask = "13600000***";
//        System.out.println(queryByPhoneMask(mask));
    }

    public static List<?> queryByPhoneMask(String mask) {
        // 1. 验证掩码格式
        if (!mask.matches("^1[3-9]\\d{6}\\*{3}$")) {
            throw new IllegalArgumentException("无效的手机号掩码格式");
        }

        // 2. 生成所有可能号码
        String prefix = mask.substring(0, 8);
        List<String> possibleNumbers = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            possibleNumbers.add(prefix + String.format("%03d", i));
        }
        return possibleNumbers;
    }

    // 加密方法示例（请替换为实际加密逻辑）

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

    public static String generateInClause(String input) {
        // 按换行符分割字符串（兼容不同系统的换行符）
        String[] lines = input.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim(); // 去除首尾空格
            if (!line.isEmpty()) {
                sb.append("'").append(line).append("'");
                if (i < lines.length - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    public static List<String> generateToList(String input) {
        List<String> list = new ArrayList();
        // 按换行符分割字符串（兼容不同系统的换行符）
        String[] lines = input.split("\\r?\\n");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim(); // 去除首尾空格
            if (!line.isEmpty()) {
                list.add(line);
            }
        }
        return list;
    }
}
