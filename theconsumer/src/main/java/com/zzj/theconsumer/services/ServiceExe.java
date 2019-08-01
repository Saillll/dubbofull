package com.zzj.theconsumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzj.entity.PaEntity;
import com.zzj.services.TestService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ServiceExe {

    @Reference(version = "1.0",group = "zzj")
    private TestService testService;

    public String getName() {
        String end = "";
        end = testService.getName();
        Object a;
        log.info(end);
        return end;
    }
    public PaEntity fixPaEntity() {
//        Logger log = LoggerFactory.getLogger("");
        PaEntity pa = new PaEntity();
        PaEntity end = testService.fixPaEntity(pa);
        log.info(end.toString());
        return end;
    }

}
