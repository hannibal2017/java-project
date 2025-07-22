package com.example.demo.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.digest.MD5;
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
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class Test1 {

    private static final Pattern SHORT_LINK_PATTERN = Pattern.compile("^[a-zA-Z0-9]{6,11}$");

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
//        int minutes = 30;
//        Date nowTime = new Date();
//        Date dateTime = DateUtil.offsetMinute(nowTime,minutes);
//        System.out.println(DateUtil.beginOfDay(new Date()));



//        String uri = "customer";
//        System.out.println(SHORT_LINK_PATTERN.matcher(uri).matches());
//        String callback = "http://d.meixin91.com";
//        String[] strings = callback.split("\\//");
//        String callBackUrl = strings[1];
//        System.out.println(callBackUrl);
//        Date futureDate = DateUtil.offsetDay(new Date(), 5);
//
//        String callback = "http://tracking.e.qq.com/conv?cb=DliHADygfPpQ2vtZbs-PC3_pqbgUpoKNZTmpNCXwznuwERCrGni0sUuxhgTwdLXa&conv_id=63044567";
//        String[] strings = callback.split("=");
//        String callBackUrl = strings[1];
//        System.out.println(callBackUrl);
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
        String input =
                "cefb37d5e5f6359b5723dce2ce8728ea\n" +
                "1760edbd92a441f2c7359c18a46e4cd1\n" +
                "f5c45ad57a14aab784fcb2ba6eac7774\n" +
                "9c1307104625fb9fcb197bff6d4ef570\n" +
                "1a3c500f6799b801b8bc09b831826312\n" +
                "efc8b3199155fc57240aad66f2cc7015\n" +
                "b371ed8c8570d04cde749caddaf7526f\n" +
                "574bb7521c2a60382447acffc3083de1\n" +
                "561c544b5aa1586715cc16f7c1bc63f1\n" +
                "f87cc3ace699962a53708d643ce770ae\n" +
                "4bc8b825b1934f3fdaa56ac8f43ff936\n" +
                "1f4b703e9d58fa1046313bfb1d01dc3d\n" +
                "e777544375c1aef67e11fb593ba5e491\n" +
                "f08fa005c941b98c6c8b52914bef6692\n" +
                "49ad86be2c350abad364b112f8ed7159\n" +
                "365c7ba761fc4b78edf94b5eae3903cc\n" +
                "0be71ec66d0050a01bd5a86efe678d79\n" +
                "5ed23e323eb543221a13a345f816c1d9\n" +
                "b0145bd984def3a388bc889cfcda9019\n" +
                "6f3d860ace5e3733dcc7ad8f0c73477f\n" +
                "a41d921c76bdcda746d9748ac03f6ab4\n" +
                "46e6474b3692240b4b00c02e7fe6fbe7\n" +
                "0ca21c99af2fa61ceacfc05a80f93562\n" +
                "2dadc4222975b0d47b749531e6ddb3b5\n" +
                "ebcbaa15d123fcb2a378b7a24b55d3b9\n" +
                "29f61f1c5cf38b82951fed61f139c874\n" +
                "3c9be5427170cef0f89081c7f22dcb51\n" +
                "fe88fa8d117cd840649475293c5d50bf\n" +
                "731a93b74bfa44f57f6857ef4029c476\n" +
                "23cdd19b5920f4a7f86887d00568083d\n" +
                "2f99e970e40dcc0fc1c657a58b03a662\n" +
                "3aaf99ed14ca8b87e501255f27fb1f37\n" +
                "919ce53cf20f19f831a371ae79928857\n" +
                "20fba3eb163202ee2c23ade61c44b09c\n" +
                "fba21d1a3f981b25c1c8af91938a9abd\n" +
                "29961bb97ffdbfdbdcfe00354be708b6\n" +
                "28ec46d5fcbe015ed6225d0b0dd74051\n" +
                "23acba1c2ec9f518ad9d1e169de0a30e\n" +
                "ede18456038b788b67e54c6c7703202b\n" +
                "b6a534947c316b2fb1b43208084a8e81\n" +
                "046766db50592d8e02f79da1f1b12cc5\n" +
                "942fcfea07eae06f543a6171d60c2ba3\n" +
                "59b5b5d8e0775a78d7fdcf25082a5155\n" +
                "5247c880585cda5530a2af2321f9b1be\n" +
                "17857c7a9092781ae83c536278cad163\n" +
                "cc436e17949285f20b8ca927b25e1bc5\n" +
                "868242e301ff26c7a0bcce793102b19f\n" +
                "7186d95a0cfdafa70691d2e2098ab884\n" +
                "57df4719287d4c9101c27fd411dc1e14\n" +
                "952308626f440e945c6fe827e149bf1c\n" +
                "96597f6f562e016668010587e554f44a\n" +
                "ba524d9dfdc784785ec562c4f6c3583c\n" +
                "1d4b21f48a058673aa53afd0f3d40aff\n" +
                "1044e0b2c750e11e725c658528a0aafa\n" +
                "b2bee97ace1689d6ade916ec80826ce5\n" +
                "fe20ed76b5173d6be080789417165cb5\n" +
                "7421687ec038c22f1dbaaedad3559e1d\n" +
                "be5f3755d8243e9593f176e266f6e296\n" +
                "e5db48f54bfbc36c4281d943aa87ee48\n" +
                "0e69a3b5838d4d46f969e1c1ea9d1ea7\n" +
                "2642e49b89a2bac890187062efc9e300\n" +
                "4bfef67013bb38476e90cb828b23b545\n" +
                "6ec0de889a61fbe76e819fb6644f6203\n" +
                "28652b76975687d1b617e8243e5eaa07\n" +
                "2ad276e649320e1d1fe1cb7d40477035\n" +
                "7c303921eb14ee31b5c3601a05a7c637\n" +
                "8cbb09f77e5adb6f3f439262a76af988\n" +
                "a9897c23c70a5f292c1b442897deed16\n" +
                "23daf9b69173b558d7c86f0dc916153c\n" +
                "4d93b1af4fe642441b37a31cdecd5479\n" +
                "8031af310dca14888d5d5d31c8f81103\n" +
                "3919f490be4f3188bf9ad88d906b6bac\n" +
                "c9bf9de753e597b7b4f4bb5326b3140a\n" +
                "3936d07d91f14d997218962de5a12a5a\n" +
                "7644a167948975b07fcd6d5e065ae1a4\n" +
                "3f1c528e6e62152aa3cd8e99e124ff9a\n";
//        System.out.println(generateToList(input));
//        //换行的手机号码，转化为sql的in条件输出
//        List<String> stringList = generateToList(input);
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < stringList.size(); i++) {
//            sb.append("'").append(stringList.get(i)).append("'");
//            if (i < stringList.size() - 1) {
//                sb.append(", ");
//            }
//        }
//        System.out.println(sb.toString());

        String inClause = generateInClause(input);
        System.out.println(inClause);
//
//        Long id = null;
//        List<String> stringList = new ArrayList<>();
//        stringList.add("111");
//        stringList.add("222");
//        System.out.println(stringList.contains(String.valueOf(id)));


        // 方法 1：split + Arrays.asList()
//        String str = "{cl-wrb,ffff}";
//        String content = str.substring(1, str.length() - 1);
//        List<String> list = Arrays.asList(content.split(","));
//        System.out.println(list);
//        String org = "cl-wrsddb";
//        System.out.println(list.contains(org));
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
