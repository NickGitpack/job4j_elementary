package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedeuro = 2;
        float outeuro = Converter.rubleToEuro(140);
        boolean passedeuro = expectedeuro == outeuro;
        System.out.println("140 rubles are 2. Test result : " + passedeuro);

        float indollar = 240;
        float expecteddollar = 4;
        float outdollar = Converter.rubleToDollar(240);
        boolean passeddollar = expecteddollar == outdollar;
        System.out.println("240 rubles are 4. Test result : " + passeddollar);
    }
}
