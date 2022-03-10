package com.company;

public class Main {

    public static void main(String[] args) {
        Methods m = new Methods();
        int[] kbPrices = new int[]{40, 35, 70, 15, 45};
        int[] usbPrices = new int[]{20, 15, 40, 15};

        System.out.println(m.minKeyboard(kbPrices));
        System.out.println(m.maxPrice(kbPrices,usbPrices));
        System.out.println(m.maxByBudget(usbPrices, 30));
        System.out.println(m.maxConsumerism(new int[]{55, 70, 80}, new int[]{5, 12}, 60));
        System.out.println(m.maxConsumerism(new int[]{60}, new int[]{8, 12}, 60));
        System.out.println(m.maxConsumerism(new int[]{40, 60}, new int[]{8, 12}, 60));
    }
}
