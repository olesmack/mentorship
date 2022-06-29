package com.mentorship.flowers;

public class FlowerStore {

    public AbstractFlower[] sell(int roseAmount, int daisyAmount, int tulipAmount) {

        Rose[] roseArray = new Rose[roseAmount];
        for (int i = 0; i < roseAmount; i++) {
            roseArray[i] = new Rose();
        }

        Daisy[] daisyArray = new Daisy[daisyAmount];
        for (int i = 0; i < daisyAmount; i++) {
            daisyArray[i] = new Daisy();
        }

        Tulip[] tulipArray = new Tulip[tulipAmount];
        for (int i = 0; i < tulipAmount; i++) {
            tulipArray[i] = new Tulip();
        }

        int roseArrLen = roseArray.length;
        int daisyArrLen = daisyArray.length;
        int tulipArrLen = tulipArray.length;
        AbstractFlower[] flowersBouquet = new AbstractFlower[roseArrLen + daisyArrLen + tulipArrLen];
        System.arraycopy(roseArray, 0, flowersBouquet, 0, roseArrLen);
        System.arraycopy(daisyArray, 0, flowersBouquet, roseArrLen, daisyArrLen);
        System.arraycopy(tulipArray, 0, flowersBouquet, daisyArrLen + roseArrLen, tulipArrLen);

        return flowersBouquet;

    }
}
