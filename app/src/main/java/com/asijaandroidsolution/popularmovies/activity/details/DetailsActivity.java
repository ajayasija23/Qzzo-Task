package com.asijaandroidsolution.popularmovies.activity.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.asijaandroidsolution.popularmovies.databinding.ActivityDetailsBinding;
import com.asijaandroidsolution.popularmovies.model.MovieDetailsModel;
import com.asijaandroidsolution.popularmovies.model.ReviewsModel;
import com.asijaandroidsolution.popularmovies.web.WebServices;
import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setSupportActionBar(binding.includeToolBar2.toolbar);
        getSupportActionBar().setTitle("Movie Details");
        Intent intent=getIntent();
        int id=intent.getIntExtra("id",0);
        WebServices.getInstance().getDetails(this,id);
        WebServices.getInstance().getReviews(this,id);
    }
    public void onSuccess(MovieDetailsModel model){
        String image="https://image.tmdb.org/t/p/w500"+model.getPosterPath();
        Glide.with(this).load(image).into(binding.ivPosterLarge);
        binding.tvAdult.setText(model.isAdult()+"");
        binding.tvBudget.setText(model.getBudget()+"");
        binding.tvLanguage.setText(model.getOriginalLanguage()+"");
        binding.tvReleaseDate.setText(model.getReleaseDate()+"");
        binding.tvTitleDetails.setText(model.getTitle()+"");
    }

    public void onSuccess(ReviewsModel reviewsModel) {
        if(!reviewsModel.getResults().isEmpty()){
            binding.rvReviews.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
            RecyclerReviewsAdapter adapter=new RecyclerReviewsAdapter(reviewsModel.getResults());
            binding.rvReviews.setAdapter(adapter);
        }
        else
            binding.noReview.setVisibility(View.VISIBLE);
    }
}