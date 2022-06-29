package com.mentorship.flowers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        System.out.println(Arrays.toString(flowerStore.sell(1,2,3)));
    }
}
