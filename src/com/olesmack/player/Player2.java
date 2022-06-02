package com.olesmack.player;

import com.olesmack.PlayerAbstractClass;

public class Player2 extends PlayerAbstractClass {

    final int price;

    public Player2(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Error");
    }
}
