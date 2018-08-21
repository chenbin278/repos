package com.abin.service.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    /**
     * 重写调用的接口
     * @param name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
