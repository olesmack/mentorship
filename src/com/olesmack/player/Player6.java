package com.olesmack.player;

import com.olesmack.PlayerAbstractClass;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player6 extends PlayerAbstractClass
{
    final int price;

    public Player6(int price) {
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

    public void shuffle()
    {
        List<String> list = Arrays.asList(getPlaylist());
        int length = list.size();
        for (int i = 0; i < getPlaylist().length; i++) {
            int index = new Random().nextInt(length);
            String shuffle = list.get(index);
            System.out.println(shuffle);
        }
    }
}
