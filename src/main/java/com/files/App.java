package com.files;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci");

        Scanner scanner = new Scanner(System.in);

        int valueLoop = scanner.nextInt();

        Fibonacci calc = new Fibonacci(valueLoop);

        System.out.println(calc.fibonacciStart());

        scanner.close();

    }
}