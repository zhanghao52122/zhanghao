package com.ymlh.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.ymlh.admin.repository")
@ComponentScan(basePackages = {
		"com.ymlh.admin.config",
		"com.ymlh.admin.api",
		"com.ymlh.admin.service",
		"com.ymlh.admin.shiro",
		"com.ymlh.admin.redis",
		"com.ymlh.common.utils"
      })
public class YmlhAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(YmlhAdminApplication.class, args);
	}

}
