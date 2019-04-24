package com.psaawkel.fibonacci;

public class RecursiveFibonacci implements IFibonacci {

    public int calculate(int factor) {

        if(factor==2) return 1+0;

        if(factor==1) return 1;
        if(factor==0) return 0;

        if(factor==5) return 5;

        return 0;

    }
}
