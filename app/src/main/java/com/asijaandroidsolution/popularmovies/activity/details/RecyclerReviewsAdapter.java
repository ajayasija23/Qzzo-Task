package com.asijaandroidsolution.popularmovies.activity.details;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.asijaandroidsolution.popularmovies.R;
import com.asijaandroidsolution.popularmovies.activity.adapter.RecyclerMovieAdapter;
import com.asijaandroidsolution.popularmovies.model.ApiResponse;
import com.asijaandroidsolution.popularmovies.model.ReviewsModel;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerReviewsAdapter extends RecyclerView.Adapter<RecyclerReviewsAdapter.MyViewHolder> {

    private Context mContext;
    private List<ReviewsModel.ResultsBean> results;
    public RecyclerReviewsAdapter(List<ReviewsModel.ResultsBean> results)
    {
        this.results=results;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_reviews,parent,false);
        return new RecyclerReviewsAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.author.setText(results.get(position).getAuthor());
        holder.review.setText(results.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView author,review;
        public MyViewHolder(@NonNull View view) {
            super(view);
            author=view.findViewById(R.id.tv_author);
            review=view.findViewById(R.id.tv_review);
        }
    }
}
