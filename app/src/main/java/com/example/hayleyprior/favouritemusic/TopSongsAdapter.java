package com.example.hayleyprior.favouritemusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hayleyprior on 07/11/2017.
 */

public class TopSongsAdapter extends ArrayAdapter<Song> {

    public TopSongsAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    public View getView(int position, View listItemView, ViewGroup parent) {
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }
        Song currentSong = getItem(position);
        TextView ranking = listItemView.findViewById(R.id.list_rank_text);
        TextView songTitle = listItemView.findViewById(R.id.list_title_text);
        TextView artist = listItemView.findViewById(R.id.list_artist_text);

        ranking.setText(currentSong.getRanking().toString());
        songTitle.setText(currentSong.getSongTitle());
        artist.setText(currentSong.getArtist());

        listItemView.setTag(currentSong);
        return listItemView;
    }

}
