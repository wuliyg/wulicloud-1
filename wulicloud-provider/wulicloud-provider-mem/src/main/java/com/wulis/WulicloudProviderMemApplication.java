package com.wulis;

import com.wulis.config.properties.AssetcloudProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties(AssetcloudProperties.class)
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.wulis.provider.**.mapper")
public class WulicloudProviderMemApplication {

    public static void main(String[] args) {
        SpringApplication.run(WulicloudProviderMemApplication.class, args);
    }

}
