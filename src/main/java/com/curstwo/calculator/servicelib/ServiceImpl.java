package com.curstwo.calculator.servicelib;

import com.curstwo.calculator.exceptions.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Interface{

    public String sayHello(){
        return "Добро пожаловать в калькулятор!";
    }

    public String sumsUp(int num1, int num2){
        int result = num1 + num2;
        return Integer.toString(result);
    }

    public String subtract(int num1, int num2){
        int result = num1 - num2;
        return Integer.toString(result);
    }

    public String multiply(int num1, int num2){
        int result = num1 * num2;
        return Integer.toString(result);
    }

    public String divide(int num1, int num2){
        if(num2 == 0){
            System.out.println("Деление на ноль не возможно!");
            throw new DivisionByZeroException();
        }
        int result = num1 / num2;
        return Integer.toString(result);
    }
}
