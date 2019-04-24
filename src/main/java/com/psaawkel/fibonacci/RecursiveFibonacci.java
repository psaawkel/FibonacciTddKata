package com.psaawkel.fibonacci;

public class RecursiveFibonacci implements IFibonacci {

    public long calculate(int factor) {

        if(factor>1)
            return calculate(factor - 1) + calculate(factor - 2);

        if(factor>0) return 1;
        return 0;
    }
}
