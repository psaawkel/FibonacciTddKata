

package com.psaawkel.fibonacci;

public class main {

    public static void main(String[] args){

        IFibonacci fibo1 = new RecursiveFibonacci();
        IFibonacci fibo2 = new IterativeFibonacci();

        int factor = 20;

        System.out.println("Recursive: fibonazzi(" + factor + ") = " + fibo1.calculate(factor));
        System.out.println("Iterative: fibonazzi(" + factor + ") = " + fibo2.calculate(factor));
    }

}
