package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/he")
    public  UserDetails helloBean(){
        return new UserDetails("Kalyan", "Reddy", "Hyd");

    }
}
