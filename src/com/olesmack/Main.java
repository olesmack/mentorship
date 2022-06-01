package com.olesmack;

import com.olesmack.player.Player1;

public class Main
{
    public String song1 = "SongName1";
    public String song2 = "SongName2";
    public String song3 = "SongName3";
    public String song4 = "SongName4";
    public String[] playlist = new String[] {"SongName1", "SongName2", "SongName3", "SongName4"};

    public static void main(String[] args) {
        Player1 player1 = new Player1(10);
    }
}

