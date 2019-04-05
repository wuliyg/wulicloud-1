package com.wulis.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.wulis.auth.**.mapper")//将项目中对应的mapper类的路径
public class WulicloudAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(WulicloudAuthApplication.class, args);
	}

}
