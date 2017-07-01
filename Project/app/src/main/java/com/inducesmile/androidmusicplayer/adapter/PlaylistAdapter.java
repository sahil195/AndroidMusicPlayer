package com.inducesmile.androidmusicplayer.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inducesmile.androidmusicplayer.R;
import com.inducesmile.androidmusicplayer.entities.PlaylistObject;

import java.util.List;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistViewHolder>{

    private static final String TAG = PlaylistAdapter.class.getSimpleName();

    private Context context;
    private List<PlaylistObject> playlists;

    public PlaylistAdapter(Context context, List<PlaylistObject> playlists) {
        this.context = context;
        this.playlists = playlists;
    }

    @Override
    public PlaylistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.play_list_layout, parent, false);
        return new PlaylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaylistViewHolder holder, int position) {
        PlaylistObject playlistObject = playlists.get(position);
        holder.playlistTitle.setText(playlistObject.getPlaylistTitle());
        holder.playlistTracks.setText(playlistObject.getPlaylistTracks());

    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
