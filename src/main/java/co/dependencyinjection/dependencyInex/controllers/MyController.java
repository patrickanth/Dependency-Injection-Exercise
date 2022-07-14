package co.dependencyinjection.dependencyInex.controllers;

import co.dependencyinjection.dependencyInex.servicies.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    private MyService myService;
    @Autowired
    public MyController(MyService myService){
        this.myService = myService;
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
