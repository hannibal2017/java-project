package com.example.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Slf4j
public class AesUtils {

    public static final String key = "573212ffeac4203a";
    /**
     * AES 加密
     *
     * @param str 待加密内容
     * @param key 加密key
     * @return 加密内容
     */
    public static String encrypt(String str, String key) {
        try {
            byte[] raw = key.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeBase64String(encrypted);
        } catch (Exception e) {
            log.error("AES 加密异常", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * AES 解密
     *
     * @param str 待解密内容
     * @param key 解密key
     * @return 解密内容
     */
    public static String decrypt(String str, String key) {
        try {
            byte[] raw = key.getBytes(StandardCharsets.UTF_8);
            SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] encrypted = cipher.doFinal(Base64.decodeBase64(str));
            return new String(encrypted);
        } catch (Exception e) {
            log.error("AES 解密异常", e);
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(AesUtils.encrypt("hello",key));
        System.out.println(AesUtils.decrypt("4hTpd1PYV67ov1aTSvXyQQ==",key));
    }
}
