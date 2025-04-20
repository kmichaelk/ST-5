package com.mycompany.app;

public class Sqrt {

    private static final double delta = 0.00000001;
    private final double arg;

    public Sqrt(double arg) {
        this.arg = arg;
    }

    public static double average(double x, double y) {
        return (x + y) / 2.0;
    }

    public static boolean good(double guess, double x) {
        return Math.abs(guess * guess - x) < delta;
    }

    public static double improve(double guess, double x) {
        return average(guess, x / guess);
    }

    public static double iter(double guess, double x) {
        if (good(guess, x))
            return guess;
        else
            return iter(improve(guess, x), x);
    }

    public double calc() {
        return iter(1.0, arg);
    }
}
