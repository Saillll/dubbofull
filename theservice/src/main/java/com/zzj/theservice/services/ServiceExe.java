package com.zzj.theservice.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.zzj.theservice.interfaces.ServiceInterface;

import java.io.Serializable;

@Service
public class ServiceExe implements ServiceInterface {

    @Override
    public Object getSomething(String id) {
        return id;
    }
}
