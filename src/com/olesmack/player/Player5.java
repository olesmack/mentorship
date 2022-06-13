package com.olesmack.player;

import com.olesmack.AbstractPlayer;

import java.util.Scanner;

public class Player5 extends AbstractPlayer
{
    public Player5(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + getPlaylist()[0]);
    }

    public void inputPlaylist() {
        System.out.println("Input playlist songs: ");
        for(int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            setPlaylist()[i] = scanner.nextLine();
        }
    }

    public void playAllSongsReverse() {
        System.out.println("Playlist reverse order: ");
        for(int i = getPlaylist().length-1; i >= 0 ; i--) {
            System.out.print(getPlaylist()[i] + "\n");
        }
    }

}
