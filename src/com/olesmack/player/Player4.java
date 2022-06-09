package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player4 extends AbstractPlayer
{
    public Player4(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

}
