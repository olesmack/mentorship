package com.olesmack.player;

import com.olesmack.PlayerAbstractClass;

public class Player1 extends PlayerAbstractClass
{
    final int price;

    public Player1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

}
