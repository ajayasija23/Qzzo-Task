package com.asijaandroidsolution.popularmovies.activity.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;

import com.asijaandroidsolution.popularmovies.R;
import com.asijaandroidsolution.popularmovies.activity.adapter.RecyclerMovieAdapter;
import com.asijaandroidsolution.popularmovies.activity.details.DetailsActivity;
import com.asijaandroidsolution.popularmovies.databinding.ActivityMainBinding;
import com.asijaandroidsolution.popularmovies.model.ApiResponse;
import com.asijaandroidsolution.popularmovies.web.WebServices;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private RecyclerMovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setSupportActionBar(binding.includeToolBar.toolbar);
        getSupportActionBar().setTitle("Popular Movies");
        WebServices.getInstance().getMovies(this);
    }
    public void onSuccess(ApiResponse response)
    {
        adapter=new RecyclerMovieAdapter(response.getResults());
        binding.rvMovies.setLayoutManager(new GridLayoutManager(this,3));
        binding.rvMovies.setAdapter(adapter);
    }
}