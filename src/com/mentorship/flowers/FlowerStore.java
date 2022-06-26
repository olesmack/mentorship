package com.mentorship.flowers;

import java.util.Scanner;

public class FlowerStore extends AbstractFlower {

//    String flowerBouquet;
//    String tempBouquetRose;
//    String tempBouquetDaisy;
//    String tempBouquetTulip;


    public void sell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of Roses: ");
        setRoseAmount(scanner.nextInt());

        System.out.println("Input numbers of Daisies: ");
        setDaisyAmount(scanner.nextInt());

        System.out.println("Input numbers of Tulips: ");
        setTulipAmount(scanner.nextInt());

        String[] tempArray = new String[getRoseAmount()];
        for (int i = 0; i < getRoseAmount(); i++) {
            tempArray[i] = ("Rose");
            System.out.println(tempArray[i]);
        }

        for (int i = 0; i < getDaisyAmount(); i++) {
            tempArray[i] = ("Daisy");
            System.out.println(tempArray[i]);
        }

        for (int i = 0; i < getTulipAmount(); i++) {
            tempArray[i] = ("Tulip");
            System.out.println(tempArray[i]);
        }
    }
}
