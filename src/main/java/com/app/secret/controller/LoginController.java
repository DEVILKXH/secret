package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
@Api(tags = "demo测试")
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "success";
    }

    public static void main(String []agrs) {
//        System.out.println(UUID.randomUUID().toString());
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        System.out.println(encoder.encode("admin"));
    }
}
