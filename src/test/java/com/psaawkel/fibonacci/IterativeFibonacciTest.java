package com.psaawkel.fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class IterativeFibonacciTest {

    static IFibonacci fibo;

    @Test
    void zeroTest(){
        assertEquals(0,fibo.calculate(0));
    }

    @Test
    void oneTest(){
        assertEquals(1,fibo.calculate(1));
    }

    @Test
    void twoTest(){
        assertEquals(1,fibo.calculate(2));
    }

    @BeforeAll
    public static void prepareForTesting(){
        fibo = new IterativeFibonacci();
    }

}
