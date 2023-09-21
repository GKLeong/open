package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author platform
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CaojiatanEnergyApplication {

    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CaojiatanEnergyApplication.class, args);
        System.out.println(
                "=========================================启动成功=========================================");
    }
}