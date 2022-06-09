package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player3 extends AbstractPlayer
{
    public Player3(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
    }
}
