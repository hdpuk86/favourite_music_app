package com.example.hayleyprior.favouritemusic;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 07/11/2017.
 */

public class TopSongs {

    private ArrayList<Song> topSongs;

    public TopSongs() {
        this.topSongs = new ArrayList<>();

        this.topSongs.add(new Song("3 Doors Down", "The Better Life", "Kryptonite", 1, "@drawable/three_doors_down"));
        this.topSongs.add(new Song("Imagine Dragons", "Night Visions", "On Top Of The World", 2, "@drawable/imagine_dragons"));
        this.topSongs.add(new Song("Mumford & Sons", "Sigh No More", "I Will Wait", 3, "@drawable/mumford"));
        this.topSongs.add(new Song("Papa Roach", "To Be Loved", "Last Resort", 4, "@drawable/papa_roach"));
        this.topSongs.add(new Song("The Prodigy", "Invaders Must Die", "Take Me To The Hospital", 5, "@drawable/prodigy"));
        this.topSongs.add(new Song("Mike Perry", "SHY Martin", "The Ocean", 6, "@drawable/mike_perry"));
        this.topSongs.add(new Song("Amy Shark", "Night Thinker EP", "Adore", 7, "@drawable/amy_shark"));
        this.topSongs.add(new Song("Dean Lewis", "Waves", "Waves", 8, "@drawable/dean_lewis"));
        this.topSongs.add(new Song("Olympia", "Self Talk", "Smoke Signals", 9, "@drawable/olympia"));
        this.topSongs.add(new Song("lorde", "Melodrama", "Perfect Places", 10, "@drawable/lorde"));
        this.topSongs.add(new Song("Slipknot", "All Hope Is Gone", "Snuff", 11, "@drawable/slipknot"));
        this.topSongs.add(new Song("The Big Moon", "Love In The 4th Dimension", "Cupid", 12, "@drawable/big_moon"));
    }

    public ArrayList<Song> getTopSongs() {
        return topSongs;
    }
}
