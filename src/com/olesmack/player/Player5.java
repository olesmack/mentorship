package com.olesmack.player;

import com.olesmack.PlayerAbstractClass;

public class Player5 extends PlayerAbstractClass
{
    final int price;

    public Player5(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

    public void playAllSongs() {
        for(int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.print("Playlist reverse order: " + getPlaylist()[i] + "\n");
        }
    }
}
