package com.example.github.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.github.Model.ResultsItem;
import com.example.github.adapter.MainAdapter;
import com.example.github.Model.MainModel;
import com.example.github.R;
import com.example.github.retrofit.ApiEndpoint;
import com.example.github.retrofit.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {
    private RecyclerView recyclerviewId;

    private ArrayList<ResultsItem> resultsItems;
    private MainAdapter mainAdapter;


    public TabFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
        initView(view);
        resultsItems = new ArrayList<>();
        getData();
        return view;
    }

    private void initView(View view) {
        recyclerviewId = view.findViewById(R.id.rvPopularMovies);
    }

    private void getData() {
        ApiEndpoint apiEndpoint = ApiService.getApiEnpoint();
        apiEndpoint.getData()
                .enqueue(new Callback<MainModel>() {
                    @Override
                    public void onResponse(Call<MainModel> call, Response<MainModel> response) {
                        if (response.isSuccessful()) {
                            resultsItems = response.body().getResults();
                            mainAdapter = new MainAdapter(resultsItems, getActivity());
                            mainAdapter.notifyDataSetChanged();
                            recyclerviewId.setAdapter(mainAdapter);
                            recyclerviewId.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
                            recyclerviewId.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                        } else {
                            Toast.makeText(getActivity(), "Error", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<MainModel> call, Throwable t) {
                        Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}

