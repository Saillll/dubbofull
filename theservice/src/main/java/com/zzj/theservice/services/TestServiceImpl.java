package com.zzj.theservice.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzj.entity.PaEntity;
import com.zzj.services.TestService;
import org.springframework.util.ObjectUtils;


@Service(group = "zzj",version = "1.0")
public class TestServiceImpl implements TestService {

    public String getName() {
        return "1111111111";
    }

    public PaEntity fixPaEntity(PaEntity pa){
        if(ObjectUtils.isEmpty(pa)){
            pa = new PaEntity();
        }
        return pa;
    }
}
