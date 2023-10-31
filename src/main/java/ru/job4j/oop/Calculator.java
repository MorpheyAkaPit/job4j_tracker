package ru.job4j.oop;

import java.net.SocketOption;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int z) {
        return sum(10) + minus(4) + multiply(5) + divide(10);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println("Static x + y = " + result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println("Nonstatic x + y = " + rsl);
        int rslmin = minus(4);
        System.out.println("Static x - b = " + rslmin);
        int rsldiv = calculator.divide(10);
        System.out.println("Nonstatic x + y = " + rsldiv);

        int finishRsl = calculator.sumAllOperation(0);
        System.out.println("Finish result = " + finishRsl);
    }
}
