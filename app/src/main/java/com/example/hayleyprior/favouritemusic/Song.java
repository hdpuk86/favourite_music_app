package com.example.hayleyprior.favouritemusic;

/**
 * Created by hayleyprior on 07/11/2017.
 */

public class Song {

    private String artist;
    private String album;
    private String songTitle;
    private Integer ranking;

    public Song(String artist, String album, String songTitle, Integer ranking){
        this.artist = artist;
        this.album = album;
        this.songTitle = songTitle;
        this.ranking = ranking;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public Integer getRanking() {
        return ranking;
    }
}
