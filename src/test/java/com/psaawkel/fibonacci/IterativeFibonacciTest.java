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

    @Test
    void fiveTest(){
        assertEquals(5,fibo.calculate(5));
    }

    @Test
    void tenTest(){
        assertEquals(55,fibo.calculate(10));
    }

    @Test
    void nineteenTest(){
        assertEquals(4181,fibo.calculate(19));
    }

    @Test
    void fiftyTest(){
        assertEquals(12586269025L,fibo.calculate(50));
    }

    @Test
    void hundredTest(){
        assertEquals(3736710778780434371L,fibo.calculate(100));
    }

    @BeforeAll
    public static void prepareForTesting(){
        fibo = new IterativeFibonacci();
    }

}
