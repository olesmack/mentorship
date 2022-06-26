package com.mentorship.flowers;

import java.util.Scanner;

public class FlowerStore extends AbstractFlower {

    String flowerBouquet;
    String tempBouquetRose;
    String tempBouquetDaisy;
    String tempBouquetTulip;


    public void sell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of Roses: ");
        setRoseAmount(scanner.nextInt());

        System.out.println("Input numbers of Daisies: ");
        setDaisyAmount(scanner.nextInt());

        System.out.println("Input numbers of Tulips: ");
        setTulipAmount(scanner.nextInt());

        tempBouquetRose = String.valueOf(getRoseAmount());
        tempBouquetDaisy = String.valueOf(getDaisyAmount());
        tempBouquetTulip = String.valueOf(getTulipAmount());
        flowerBouquet = tempBouquetRose + tempBouquetDaisy + tempBouquetTulip;
        System.out.println(flowerBouquet);

        setFlowerBouquet(flowerBouquet);
    }
}
