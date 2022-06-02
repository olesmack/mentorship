package com.olesmack;

public class PlayerAbstractClass
{
    private String song;
    private String[] playlist = new String[] {};

    public void setSong(String song) {
        this.song = song;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public String getSong() {
        return song;
    }

    public String[] getPlaylist() {
        return playlist;
    }
}

