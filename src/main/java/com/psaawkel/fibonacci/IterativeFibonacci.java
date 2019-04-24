package com.psaawkel.fibonacci;

public class IterativeFibonacci implements IFibonacci {

    public int calculate(int factor) {

        if(factor==2) return 1+0;

        if(factor==1) return 1;
        return 0;
    }
}
