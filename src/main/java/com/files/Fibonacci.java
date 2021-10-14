package com.files;

public class Fibonacci {

    private int loop;

    public Fibonacci(int loop) {
        this.loop = loop;
    }

    public int fibonacciStart() {
        int numberOne = 0;
        int numberTwo = 1;
        int numberAux = 0;

        for (int cont = 1; cont <= loop; cont++) {

            numberAux = numberOne + numberTwo;

            numberOne = numberTwo;
            numberTwo = numberAux;
        }

        return numberAux;

    }

}
