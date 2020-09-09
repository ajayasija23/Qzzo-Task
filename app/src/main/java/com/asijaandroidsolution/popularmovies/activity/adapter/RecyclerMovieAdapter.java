package com.asijaandroidsolution.popularmovies.activity.adapter;

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
import com.asijaandroidsolution.popularmovies.activity.details.DetailsActivity;
import com.asijaandroidsolution.popularmovies.model.ApiResponse;
import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerMovieAdapter extends RecyclerView.Adapter<RecyclerMovieAdapter.MyViewHolder> {
    private Context mContext;
    List<ApiResponse.ResultsBean> results;
    public RecyclerMovieAdapter(List<ApiResponse.ResultsBean> results)
    {
        this.results=results;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_poster,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        String image="https://image.tmdb.org/t/p/w200"+results.get(position).getPosterPath();
        Glide.with(mContext).load(image).into(holder.poster);
        holder.title.setText(results.get(position).getTitle());
        holder.poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(mContext, DetailsActivity.class);
                intent.putExtra("id",results.get(position).getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView title;
        public MyViewHolder(@NonNull View view) {
            super(view);
            poster=view.findViewById(R.id.iv_poster);
            title=view.findViewById(R.id.tv_title);
        }
    }
}
