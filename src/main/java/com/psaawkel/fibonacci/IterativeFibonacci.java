package com.psaawkel.fibonacci;

public class IterativeFibonacci implements IFibonacci {

    public long calculate(int factor) {

        if(factor==0) return 0;
        if(factor==1) return 1;

        long a=0;
        long b=1;

        for(int i=2; i<=factor; i++){
            long tmp = a+b;
            a=b;
            b=tmp;
        }

        return b;

    }
}
