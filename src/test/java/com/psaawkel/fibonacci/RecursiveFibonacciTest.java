package com.psaawkel.fibonacci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveFibonacciTest {

    static IFibonacci fibo;

    @Test
    void zeroTest(){
        assertEquals(0,fibo.calculate(0));
    }

    @BeforeAll
    public static void prepareForTesting(){
        fibo = new RecursiveFibonacci();
    }
}
