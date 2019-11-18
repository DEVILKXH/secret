package com.app.secret.controller;

import io.swagger.annotations.Api;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Controller
@RequestMapping(value = "demo")
@Api(tags = "demo测试")
public class DemoController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "success";
    }

    public static void main(String []agrs) {
//        System.out.println(UUID.randomUUID().toString());
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        System.out.println(encoder.encode("admin"));
    }
}
