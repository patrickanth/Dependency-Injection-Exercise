package co.dependencyinjection.dependencyInex.controllers;

import co.dependencyinjection.dependencyInex.servicies.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
    private MyService myService;
    public MyController(){
        System.out.println("MyController constructor");
    }
    @RequestMapping("/")
    public String hello(){
        return "Hello There";
    }

    @GetMapping("/getName")
    public String getName(){
        return myService.getname();
    }

}
