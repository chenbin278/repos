package com.abin.service.client.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@Controller
public class TestController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(String name){
        System.out.println("port:8763");
        return "helloWorld!!!"+name;
    }
}
