package com.olesmack.player;

import com.olesmack.PlayerAbstractClass;

public class Player3 extends PlayerAbstractClass
{
    final int price;

    public Player3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

    public void playAllSongs() {
        System.out.println("Playlist: " + getPlaylist() + "\n");
    }
}
