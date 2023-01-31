package ru.netology;

public class BinOps {

    public String sum(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int resultInt = intA + intB;
        String result = Integer.toBinaryString(resultInt);

        return result;
    }

    public String mult(String a, String b) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int resultInt = intA * intB;
        String result = Integer.toBinaryString(resultInt);

        return result;
    }
}
