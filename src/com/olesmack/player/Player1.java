package com.olesmack.player;

import com.olesmack.Main;

public class Player1 extends Main
{
    final int price;

    public Player1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + song1);
    }

}
