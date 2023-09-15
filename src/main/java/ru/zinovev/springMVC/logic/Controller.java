package ru.zinovev.springMVC.logic;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }

    @GetMapping("/")
    public String sayHelloLocalHost() {
        return "hello_local_host";
    }
}
