package com.olesmack.player;

import com.olesmack.Main;

public class Player5 extends Main
{
    final int price;

    public Player5(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + song1);
    }

    public void playAllSongs() {
        for(int i = playlist.length-1; i >= 0 ; i--) {
            System.out.print("Playlist reverse order: " + playlist[i] + "\n");
        }
    }
}
