package com.curstwo.calculator.servicelib;

import com.curstwo.calculator.exceptions.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceImplTest {

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private ServiceImpl service;
    DivisionByZeroException divisionByZeroException = new DivisionByZeroException();

    @BeforeEach
    public void setUp(){
        this.num1 = 10;
        this.num2 = 2;
        this.num3 = -5;
        this.num4 = 0;
        service = new ServiceImpl();
    }

    @Test
    public void plus(){
        String resultMethod1 = service.sumsUp(num1, num2);
        String resultMethod2 = service.sumsUp(num1, num3);

        int result1 = num1 + num2;
        int result2 = num1 + num3;

        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
        Assertions.assertEquals(Integer.toString(result2), resultMethod2);
    }

    @Test
    public void minus(){
        String resultMethod1 = service.subtract(num1, num2);
        String resultMethod2 = service.subtract(num1, num3);

        int result1 = num1 - num2;
        int result2 = num1 - num3;

        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
        Assertions.assertEquals(Integer.toString(result2), resultMethod2);
    }

    @Test
    public void multiply(){
        String resultMethod1 = service.multiply(num1, num2);
        String resultMethod2 = service.multiply(num1, num3);

        int result1 = num1 * num2;
        int result2 = num1 * num3;

        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
        Assertions.assertEquals(Integer.toString(result2), resultMethod2);
    }

    @Test
    public void divide(){
        String resultMethod1 = service.divide(num1, num2);
        String resultMethod2 = service.divide(num1, num3);

        int result1 = num1 / num2;
        int result2 = num1 / num3;

        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
        Assertions.assertEquals(Integer.toString(result2), resultMethod2);
    }

    @Test
    public void divisionByZeroException(){
        Assertions.assertThrows(DivisionByZeroException.class, () -> service.divide(num1, num4));
    }
}
