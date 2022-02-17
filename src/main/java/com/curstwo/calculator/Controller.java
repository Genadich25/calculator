package com.curstwo.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller{
    private Service service = new Service();

    public Controller(Service service){
        this.service = service;
    }

    @GetMapping
    public String sayHello(){
        return service.sayHello();
    }

    @GetMapping(path = "/plus")
    public String sumsUp(int num1, int num2){
        return service.sumsUp(num1, num2);
    }

    @GetMapping (path = "/minus")
    public String subtract(int num1, int num2){
        return service.subtract(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiply (int num1, int num2){
        return service.multiply(num1, num2);
    }

    @GetMapping (path = "/divide")
    public String divide(int num1, int num2){
        return service.divide(num1, num2);
    }
}
