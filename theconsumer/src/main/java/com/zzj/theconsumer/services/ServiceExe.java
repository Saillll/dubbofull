package com.zzj.theconsumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzj.services.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceExe {

    @Reference(version = "1.0",group = "zzj")
    private TestService testService;

    public String getName() {
        String end = "";
        end = testService.getName();
        log.info(end);
        return end;
    }
}
