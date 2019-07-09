package com.zzj.theservice.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzj.services.TestService;

import java.io.Serializable;

@Service(group = "zzj",version = "1.0")
public class TestServiceImpl implements TestService {

    public String getName() {
        return "1111111111";
    }
}
