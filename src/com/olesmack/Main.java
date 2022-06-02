package com.olesmack;

import com.olesmack.player.Player1;

public class Main {
    public static void main(String[] args) {

        Player1 player1 = new Player1(1);
        player1.setSong("Some song");
        player1.playSong();
        System.out.println("Player1 price: " + player1.getPrice());
    }
}
