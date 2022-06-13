package com.olesmack;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class AbstractPlayer
{
    final int price;
    private String song;
    private String[] playlist = new String[3];

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
      this.playlist = playlist;
    }

    public void inputPlaylist() {
        System.out.println("Input playlist songs: ");
        for(int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            playlist[i] = scanner.nextLine();
        }
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public String getSong() {
        return song;
    }

    protected abstract void playSong();

    public void playAllSongs() {
        System.out.println("Playlist: ");
        for(int i = 0; i < playlist.length; i++) {
            System.out.print(getPlaylist()[i] + "\n");
        }
    }

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

    public void inputSongName() {
        Scanner scanner = new Scanner(System.in);
        setSong(scanner.nextLine());
    }

}

