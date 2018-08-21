package com.abin.service.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * service-ribbon调用 service-client的API接口时，会执行快速失败，直接返回一组字符串，而不是等待响应超时，这很好的控制了容器的线程阻塞。
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")//该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/index?name="+name,String.class);
    }

    //当请求错误时，调用此方法
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
