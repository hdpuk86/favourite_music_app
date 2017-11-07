package com.example.hayleyprior.favouritemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);
        TopSongs topSongs = new TopSongs();
        ArrayList<Song> songList = topSongs.getTopSongs();

        TopSongsAdapter songAdapter = new TopSongsAdapter(this, songList);
        ListView listView = (ListView)findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);
    }

    public void getSong(View listItem){
        Song song = (Song)listItem.getTag();
        Intent i = new Intent(this, SongActivity.class);
        i.putExtra("title", song.getSongTitle());
        i.putExtra("artist", song.getArtist());
        i.putExtra("album", song.getAlbum());
        i.putExtra("ranking", song.getRanking().toString());
        i.putExtra("image", song.getUri());
        startActivity(i);
    }
}
