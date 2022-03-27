package com.curstwo.calculator.servicelib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ServiceImplParamTest {

    private final static int num1 = 10;
    private final static int num2 = 2;
    private final static int num3 = -5;
    private final static int num4 = 3;
    private ServiceImpl service;

    @BeforeEach
    public void setUp(){
        service = new ServiceImpl();
    }

    public static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(num1, num1),
                Arguments.of(num1, num2),
                Arguments.of(num1, num3),
                Arguments.of(num1, num4));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void plus(int num1, int num2){
        String resultMethod1 = service.sumsUp(num1, num2);
        int result1 = num1 + num2;
        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void minus(int num1, int num2){
        String resultMethod1 = service.subtract(num1, num2);
        int result1 = num1 - num2;
        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void multiply(int num1, int num2){
        String resultMethod1 = service.multiply(num1, num2);
        int result1 = num1 * num2;
        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    public void divide(int num1, int num2){
        String resultMethod1 = service.divide(num1, num2);
        int result1 = num1 / num2;
        Assertions.assertEquals(Integer.toString(result1), resultMethod1);
    }
}
