package com.inducesmile.androidmusicplayer.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.inducesmile.androidmusicplayer.R;


public class SongViewHolder extends RecyclerView.ViewHolder{

    public TextView songTitle;
    public TextView songAuthor;
    public ImageView songImage;

    public SongViewHolder(View itemView, TextView songTitle, TextView songAuthor, ImageView songImage) {
        super(itemView);
        this.songTitle = songTitle;
        this.songAuthor = songAuthor;
        this.songImage = songImage;
    }

    public SongViewHolder(View itemView) {
        super(itemView);

        songTitle = (TextView)itemView.findViewById(R.id.song_title);
        songAuthor = (TextView)itemView.findViewById(R.id.song_author);
        songImage = (ImageView)itemView.findViewById(R.id.song_cover);
    }
}
