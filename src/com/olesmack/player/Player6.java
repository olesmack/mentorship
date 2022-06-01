package com.olesmack.player;

import com.olesmack.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player6 extends Main
{
    final int price;

    public Player6(int price) {
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

    public void shuffle()
    {
        List<String> list = Arrays.asList(playlist);
        int length = list.size();
        for (int i = 0; i < playlist.length; i++) {
            int index = new Random().nextInt(length);
            String shuffle = list.get(index);
            System.out.println(shuffle);
        }
    }
}
