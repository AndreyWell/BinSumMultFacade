package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String sum = bins.sum("110", "10011");
        String mult = bins.mult("10", "1010");

        System.out.println("sum: " + sum + " "
                + "(" + Integer.parseInt(sum, 2) + ")");
        System.out.println("mult: " + mult + " "
                + "(" + Integer.parseInt(mult, 2) + ")");

    }
}