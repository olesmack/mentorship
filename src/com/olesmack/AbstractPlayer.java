package com.olesmack;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class AbstractPlayer
{
    final int price;
    private String song;
    private String[] playlist = new String[] {"hello", "Its me"};

    protected AbstractPlayer(int price) {
        this.price = price;
    }

    public int getPrice() {
        System.out.println("Price: " + price);
        return price;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setPlaylist(String[] playlist) {
//        Scanner scanner = new Scanner(System.in);
//        for(int i = 0; i <= playlist.length; i++) {
//            playlist[i] = scanner.nextLine();
//        }
        this.playlist = playlist;
    }

    public String getSong() {
        return song;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    protected abstract void playSong();

    public void playAllSongs() {
        for(int i = 0; i <= playlist.length; i++) {
            System.out.print("Playlist: " + getPlaylist()[i] + "\n");
        }    }

    public void playAllSongsReverse() {
        for(int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.print("Playlist reverse order: " + getPlaylist()[i] + "\n");
        }
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

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        setSong(scanner.nextLine());
    }

}

