package com.company;

public class Main {

    public static void main(String[] args) {
        Methods m = new Methods();
        int[] kb_prices = new int[]{40, 35, 70, 15, 45};

        System.out.println(m.min_kb(kb_prices));
    }
}
