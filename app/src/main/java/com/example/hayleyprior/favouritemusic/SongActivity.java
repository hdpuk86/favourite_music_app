package com.example.hayleyprior.favouritemusic;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    private TextView songRank;
    private TextView songArtist;
    private TextView songAlbum;
    private TextView songName;
    private ImageView albumImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_activity);

        songRank = findViewById(R.id.song_rank);
        songArtist = findViewById(R.id.artist_text);
        songAlbum = findViewById(R.id.album_text);
        songName = findViewById(R.id.song_text);
        albumImage = findViewById(R.id.album_image);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String rank = extras.getString("ranking");
        String artist = extras.getString("artist");
        String album = extras.getString("album");
        String name = extras.getString("title");
        String uri = extras.getString("image");

        int id = getResources().getIdentifier(uri, "drawable", getPackageName());
        albumImage.setImageResource(id);

        songRank.setText(rank);
        songArtist.setText("Artist: " + artist);
        songAlbum.setText("Album: " + album);
        songName.setText("Title: " + name);
    }
}
