package com.mentorship.flowers;

import org.w3c.dom.ls.LSOutput;

public class AbstractFlower {

    private int roseAmount;
    private int daisyAmount;
    private int tulipAmount;

    public int getRoseAmount() {
        return roseAmount;
    }

    public int getDaisyAmount() {
        return daisyAmount;
    }

    public int getTulipAmount() {
        return tulipAmount;
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


}
