package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player5 extends AbstractPlayer
{
    public Player5(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

}
