package com.olesmack.player;

import com.olesmack.AbstractPlayer;

public class Player1 extends AbstractPlayer
{
    public Player1(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("PlayerOne");
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
        System.out.println();
    }

    public void inputSong() {
        System.out.println("Input song name to play: ");
        inputSongName();
    }

}
