package com.wulis.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WulicloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WulicloudGatewayApplication.class, args);
    }

}
