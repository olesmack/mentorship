package com.mentorship.flowers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlowerStore extends AbstractFlower {

    public Object[] sell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of Roses: ");
        setRoseAmount(scanner.nextInt());

        System.out.println("Input numbers of Daisies: ");
        setDaisyAmount(scanner.nextInt());

        System.out.println("Input numbers of Tulips: ");
        setTulipAmount(scanner.nextInt());

        String[] roseArray = new String[getRoseAmount()];
        for (int i = 0; i < getRoseAmount(); i++) {
            roseArray[i] = ("Rose");
        }

        String[] daisyArray = new String[getDaisyAmount()];
        for (int i = 0; i < getDaisyAmount(); i++) {
            daisyArray[i] = ("Daisy");
        }

        String[] tulipArray = new String[getTulipAmount()];
        for (int i = 0; i < getTulipAmount(); i++) {
            tulipArray[i] = ("Tulip");
        }

        List list = new ArrayList(Arrays.asList(roseArray));
        list.addAll(Arrays.asList(daisyArray));
        list.addAll(Arrays.asList(tulipArray));
        Object[] flowersBouquet = list.toArray();

//        int roseArrLen = roseArray.length;
//        int daisyArrLen = daisyArray.length;
//        int tulipArrLen = tulipArray.length;
//        String[] flowersBouquet = new String[roseArrLen + daisyArrLen + tulipArrLen];
//
//        System.arraycopy(roseArray, 0, flowersBouquet, 0, roseArrLen);
//        System.arraycopy(daisyArray, 0, flowersBouquet, roseArrLen, daisyArrLen);
//        System.arraycopy(tulipArray, 0, flowersBouquet, daisyArrLen, tulipArrLen);

        return flowersBouquet;
    }
    public Object[] sellSequence() {

    }

}
