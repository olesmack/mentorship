package com.mentorship.flowers;

public class AbstractFlower {

    private int roseAmount;
    private int daisyAmount;
    private int tulipAmount;
    private int[] bouquet;
    private String flowerBouquet;

    public String getFlowerBouquet() {
        return flowerBouquet;
    }

    public void setFlowerBouquet(String flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    public int getRoseAmount() {
        return roseAmount;
    }

    public int getDaisyAmount() {
        return daisyAmount;
    }

    public int getTulipAmount() {
        return tulipAmount;
    }

    public int[] getBouquet() {
        return bouquet;
    }

    public void setRoseAmount(int roseAmount) {
        this.roseAmount = roseAmount;
    }

    public void setDaisyAmount(int daisyAmount) {
        this.daisyAmount = daisyAmount;
    }

    public void setTulipAmount(int tulipAmount) {
        this.tulipAmount = tulipAmount;
    }

    public void setBouquet(int[] bouquet) {
        this.bouquet = bouquet;
    }

}
