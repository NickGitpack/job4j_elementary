package ru.job4j.calculator;

public class CalculatorMetod {

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        CalculatorMetod.plus(100, 500);
        CalculatorMetod.plus(4, 2);
        CalculatorMetod.plus(3, 5);

    }
}
