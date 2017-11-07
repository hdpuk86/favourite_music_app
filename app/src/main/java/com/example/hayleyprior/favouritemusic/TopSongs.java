package com.example.hayleyprior.favouritemusic;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 07/11/2017.
 */

public class TopSongs {

    private ArrayList<Song> topSongs;

    public TopSongs() {
        this.topSongs = new ArrayList<>();

        this.topSongs.add(new Song("3 Doors Down", "The Better Life", "Kryptonite", 1));
        this.topSongs.add(new Song("Imagine Dragons", "Night Visions", "On Top Of The World", 2));
        this.topSongs.add(new Song("Mumford & Sons", "Sigh No More", "I Will Wait", 3));
        this.topSongs.add(new Song("Papa Roach", "To Be Loved", "Last Resort", 4));
        this.topSongs.add(new Song("The Prodigy", "Invaders Must Die", "Take Me To The Hospital", 5));
        this.topSongs.add(new Song("Mike Perry", "SHY Martin", "The Ocean", 6));
        this.topSongs.add(new Song("Amy Shark", "Adore", "Adore", 7));
        this.topSongs.add(new Song("Dean Lewis", "Waves", "Waves", 8));
        this.topSongs.add(new Song("Olympia", "Self Talk", "Smoke Signals", 9));
        this.topSongs.add(new Song("Lorde", "Melodrama", "Perfect Places", 10));
        this.topSongs.add(new Song("Slipknot", "All Hope Is Gone", "Snuff", 11));
        this.topSongs.add(new Song("The Big Moon", "Love In The 4th Dimension", "Cupid", 12));
    }


    public ArrayList<Song> getTopSongs() {
        return topSongs;
    }
}
