package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player6 extends AbstractPlayer
{
    public Player6(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
    }
}
