package com.psaawkel.fibonacci;

public class IterativeFibonacci implements IFibonacci {

    public int calculate(int factor) {

        if(factor==0) return 0;
        if(factor==1) return 1;
        if(factor==2) return 1+0;

        int a=0;
        int b=1;

        for(int i=2; i<=factor; i++){
            int tmp = a+b;
            a=b;
            b=tmp;
        }

        return b;

    }
}
