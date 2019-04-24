package com.psaawkel.fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveFibonacciTest {

    static IFibonacci fibo;

    @Test
    void simplyTest(){
        assertEquals(0,fibo.calculate(10));
        assertEquals(0,fibo.calculate(5));
        assertEquals(0,fibo.calculate(2));
        assertEquals(0,fibo.calculate(1));
    }


    @Test
    void simplyTest2(){
        assertEquals(0,fibo.calculate(10));
        assertEquals(0,fibo.calculate(5));
        assertEquals(0,fibo.calculate(2));
        assertEquals(0,fibo.calculate(1));
    }

    @BeforeAll
    public static void prepareForTesting(){
        fibo = new RecursiveFibonacci();
    }
}
