package com.curstwo.calculator;

import com.curstwo.calculator.servicelib.ServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller{
    private final ServiceImpl service;

    public Controller(ServiceImpl service){
        this.service = service;
    }

    @GetMapping
    public String sayHello(){
        return service.sayHello();
    }

    @GetMapping(path = "/plus")
    public String sumsUp(int num1, int num2){
        return num1 + " + " + num2 + " = " + service.sumsUp(num1, num2);
    }

    @GetMapping (path = "/minus")
    public String subtract(int num1, int num2){
        return num1 + " - " + num2 + " = " +  service.subtract(num1, num2);
    }

    @GetMapping (path = "/multiply")
    public String multiply (int num1, int num2){
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }

    @GetMapping (path = "/divide")
    public String divide(int num1, int num2){
        return num1 + " / " + num2 + " = " + service.divide(num1, num2);
    }
}
