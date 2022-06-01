package com.olesmack.player;

import com.olesmack.Main;

public class Player4 extends Main
{
    final int price;

    public Player4(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + song4);
    }

    public void playAllSongs() {
        System.out.println("Playlist: " + playlist + "\n");
    }
}
