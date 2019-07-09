package com.zzj.theconsumer.services;

import com.zzj.theservice.interfaces.ServiceInterface;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

@Component
public class ServiceExe implements ServiceInterface {

    @Reference
    private ServiceInterface serviceInterface;

    @Override
    public Object getSomething(String id) {
        return serviceInterface.getSomething(id);
    }
}
