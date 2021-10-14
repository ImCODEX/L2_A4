package com.company;

public class Methods {

    /**
     *
     * @param kb: array of prices
     * @return: min value
     */
    public int min_kb(int[] kb){
        int min = Integer.MAX_VALUE;
        for (int j : kb) {
            if (j < min)
                min = j;
        }
        return min;
    }

    /**
     * Maximum of two arrays
     * @param kb: keyboard prices
     * @param usb: usb prices
     * @return: maximum price
     */
    public int max_price(int[] kb, int[] usb){
        int max = 0;
        for (int j : kb) {
            if (j > max)
                max = j;
        }

        for (int j : usb) {
            if (j > max)
                max = j;
        }

        return max;
    }
}
