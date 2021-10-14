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
}
