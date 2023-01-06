package ru.job4j.array;

import com.sun.source.util.SourcePositions;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        names[0] = "Petr Arsentev";
        names[1] = "Ivan Ivanov";
        names[2] = "Petr Petrov";
        names[3] = "Aleksey Alekseev";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
