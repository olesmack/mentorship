package com.olesmack;

import com.olesmack.player.*;

public class Main {
    public static void main(String[] args) {

        Player1 player1 = new Player1(1);
        Player2 player2 = new Player2(2);
        Player3 player3 = new Player3(3);
        Player4 player4 = new Player4(4);
        Player5 player5 = new Player5(5);
        Player6 player6 = new Player6(6);

//        player1.playerName();
//        player1.getPrice();
//        player1.inputSong();
//        player1.playSong();
//
//        player2.playerName();
//        player2.getPrice();
//        player2.inputSong();
//        player2.playSong();

        player3.playerName();
        player3.getPrice();
        player3.inputPlaylist();
        player3.playSong();
        player3.playAllSongs();
    }
}
