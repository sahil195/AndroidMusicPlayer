package com.inducesmile.androidmusicplayer.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.inducesmile.androidmusicplayer.R;

public class PlaylistViewHolder extends RecyclerView.ViewHolder{

    public TextView playlistTitle;
    public TextView playlistTracks;
    public ImageView playlistCover;

    public PlaylistViewHolder(View itemView) {
        super(itemView);

        playlistTitle = (TextView)itemView.findViewById(R.id.play_list_name);
        playlistTracks = (TextView)itemView.findViewById(R.id.number_of_tracks);
        playlistCover = (ImageView)itemView.findViewById(R.id.play_list_cover);
    }
}
