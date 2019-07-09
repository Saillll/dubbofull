package com.zzj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zzj.theservice.services")
public class TheserviceApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(TheserviceApplication.class, args);
        System.in.read();
    }

}
