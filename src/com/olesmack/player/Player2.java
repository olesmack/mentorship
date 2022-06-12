package com.olesmack.player;

import com.olesmack.AbstractPlayer;

import java.util.Scanner;

public class Player2 extends AbstractPlayer {

    public Player2(int price) {
        super(price);
    }

    public void playerName() {
        System.out.println("PlayerTwo");
    }

    @Override
    public void playSong() {
        if (getSong() != null) {
            System.out.println("Error");
            System.out.println();
        }
    }

    public void inputSong() {
        System.out.println("Input song name to play: ");
        inputData();
    }

}
