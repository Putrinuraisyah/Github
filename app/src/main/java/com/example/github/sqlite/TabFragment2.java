package com.example.github.sqlite;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.EmptyStackException;

import com.example.github.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment2 extends Fragment {


    RecyclerView recyclerView;
    FloatingActionButton add_button;

    MyDatabaseHelper myDB;

    ArrayList<String> Movie_id, Nama_title, Movie_judul, Movie_review;
    CustomAdapter customAdapter;
    ListView listView;

    public TabFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_fragment2, container, false);


        View recyclerView = (View) view.findViewById(R.id.recyclerView);
        View add_button = (View) view.findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TabFragment2.this.getActivity(), AddActivity.class);
                startActivity(intent);
            }


        });return view;




    }



    void storeDataInArrays(){
        Cursor cursor = myDB.readAllData();
        if(cursor.getCount() == 0){
            Toast.makeText(getActivity(),"No data", Toast.LENGTH_SHORT).show();
        }else{
            while(cursor.moveToNext()){
                Movie_id.add(cursor.getString(0));
                Nama_title.add(cursor.getString(1));
                Movie_judul.add(cursor.getString(2));
                Movie_review.add(cursor.getString(3));
            }
        }
    }

}
