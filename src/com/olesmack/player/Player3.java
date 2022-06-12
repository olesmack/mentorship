package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player3 extends AbstractPlayer
{
    public Player3(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("PlayerThree");
    }

    @Override
    public void playSong() {
        if (getSong() != null) {
            System.out.println("Error");
            System.out.println();
        }
    }

    public void playList() {
        System.out.println("Playlist: "+ getPlaylist());
    }

}
