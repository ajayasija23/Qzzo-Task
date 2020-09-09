package com.asijaandroidsolution.popularmovies.web;

import com.asijaandroidsolution.popularmovies.model.MovieDetailsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DetailsApi {
    @GET("/3/movie/{id}")
    Call<MovieDetailsModel>getDetails(@Path("id") int id,
                                      @Query("api_key") String key);
}
