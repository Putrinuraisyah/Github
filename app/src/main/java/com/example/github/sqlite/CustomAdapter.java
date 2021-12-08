package com.example.github.sqlite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.github.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList Movie_id, Nama_title, Movie_judul, Movie_review;

    CustomAdapter(Context context, ArrayList Movie_id, ArrayList Nama_title, ArrayList Movie_judul,
                  ArrayList Movie_review){
        this.context = context;
        this.Movie_id = Movie_id;
        this.Nama_title = Nama_title;
        this.Movie_judul = Movie_judul;
        this.Movie_review = Movie_review;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.movie_id_txt.setText(String.valueOf(Movie_id.get(i)));
        myViewHolder.nama_title_txt.setText(String.valueOf(Nama_title.get(i)));
        myViewHolder.movie_judul_txt.setText(String.valueOf(Movie_judul.get(i)));
        myViewHolder.movie_review_txt.setText(String.valueOf(Movie_review.get(i)));

    }

    @Override
    public int getItemCount() {
        return Movie_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView movie_id_txt, nama_title_txt, movie_judul_txt, movie_review_txt;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            movie_id_txt = itemView.findViewById(R.id.movie_id_txt);
            nama_title_txt = itemView.findViewById(R.id.nama_title_txt);
            movie_judul_txt = itemView.findViewById(R.id.movie_judul_txt);
            movie_review_txt = itemView.findViewById(R.id.movie_review_txt);
        }
    }
}
