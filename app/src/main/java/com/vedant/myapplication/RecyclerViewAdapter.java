package com.vedant.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.invoke.ConstantCallSite;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    List<Songs> songList;
    Context context;

    public RecyclerViewAdapter(List<Songs> songList, Context context) {
        this.songList = songList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view   = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.artistName.setText(songList.get(position).getArtistName());
        holder.songName.setText(songList.get(position).getName());
        Glide.with(this.context).load(songList.get(position).getImage()).into(holder.songImages);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = songList.get(position).getSongUrl();

                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        holder.parentLayout.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//                MenuInflater inflater = new MenuInflater(v.getContext());
//                inflater.inflate(R.menu.context_menu, menu );
                menu.add(0,0,0,"Open Vedio").setOnMenuItemClickListener(M1);
                menu.add(0,1,1,"Open Song Wiki").setOnMenuItemClickListener(M1);
                menu.add(0,2,2,"Open Artist Wiki").setOnMenuItemClickListener(M1);

            }

            private MenuItem.OnMenuItemClickListener M1 = new MenuItem.OnMenuItemClickListener() {

                @Override
                public boolean onMenuItemClick(MenuItem item) {


                    switch (item.getOrder()) {
                        case 0:
                            String url = songList.get(position).getSongUrl();
                            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                            return true;
                        case 1:
                            String url1 = songList.get(position).getSongWiki();
                            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url1)));
                            return true;
                        case 2:
                            String url2 = songList.get(position).getArtistWiki();
                            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url2)));
                            return true;
                        default:
                            System.out.println("Default Action");
                            return false;

                    }
                }
            };
        });

//        holder.parentLayout.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//            //TODO
//                System.out.println("\n HERE WE Are \n" );
//
//                return false;
//            }
//        });

    }


    @Override
    public int getItemCount() {
        return songList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView songImages;
        TextView songName;
        TextView artistName;
        LinearLayout parentLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            songImages = itemView.findViewById(R.id.SongImageList);
            songName = itemView.findViewById(R.id.SongName);
            artistName = itemView.findViewById(R.id.ArtistName);
            parentLayout = itemView.findViewById(R.id.blockA);
//            this.itemView = itemView;
//            itemView.setOnCreateContextMenuListener(this);

        }

    }
}
