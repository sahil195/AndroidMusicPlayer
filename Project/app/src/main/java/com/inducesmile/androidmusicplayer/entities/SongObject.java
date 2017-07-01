package com.inducesmile.androidmusicplayer.entities;

public class SongObject {

    private String songCover;
    private String songTitle;
    private String songAuthor;

    public SongObject(String songTitle, String songAuthor, String songCover) {
        this.songCover = songCover;
        this.songAuthor = songAuthor;
        this.songTitle = songTitle;
    }

    public String getSongCover() {
        return songCover;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public String getSongTitle() {
        return songTitle;
    }
}
