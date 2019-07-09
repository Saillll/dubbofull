package com.zzj.theconsumer.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/dubbo-consumer.properties")
public class DubboConfig {
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
////        registryConfig.setUsername("serviceProducer");
//        return registryConfig;
//    }

}
