package com.accp.springboot.cfg;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan(basePackages = { "com.accp.springboot.dao" })
public class BeansConfig {
	

}
