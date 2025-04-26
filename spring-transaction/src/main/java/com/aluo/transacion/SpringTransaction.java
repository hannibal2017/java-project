package com.aluo.transacion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.transacion
 * @date 2025/4/26 16:18
 */
@MapperScan("com.aluo.transacion.mapper")
@SpringBootApplication
public class SpringTransaction {
    public static void main(String[] args) {
        SpringApplication.run(SpringTransaction.class, args);
    }

}
