package com.zzj.nw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/")
public class NwApplication {

    public static void main(String[] args) {
        SpringApplication.run(NwApplication.class, args);
    }

    @GetMapping("/a")
    public String aa(){
        return  "aaa";
    }
}
