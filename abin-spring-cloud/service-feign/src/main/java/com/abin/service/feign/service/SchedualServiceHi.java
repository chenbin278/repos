package com.abin.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//fallback指定服务连接失败时，访问的类
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)//指定调用哪个服务
public interface SchedualServiceHi {

    @RequestMapping(value = "/index",method = RequestMethod.GET)//指定调用哪个接口
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
