package com.zzj.theconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.zzj.theconsumer.services")
//@ComponentScan("com.zzj.theconsumer.services")
//@ComponentScan("com.zzj.theconsumer.controller")
@DubboComponentScan(basePackages = "com.zzj.theconsumer")
@RestController
public class TheconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheconsumerApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
