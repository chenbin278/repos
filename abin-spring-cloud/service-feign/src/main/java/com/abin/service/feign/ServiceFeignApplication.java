package com.abin.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients//开启feign功能
public class ServiceFeignApplication {

    /**
     *Feign 采用的是基于接口的注解
     * Feign 整合了ribbon，具有负载均衡的能力
     * 整合了Hystrix，具有熔断的能力
     * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
     */


    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
