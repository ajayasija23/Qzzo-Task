package com.asijaandroidsolution.popularmovies.web;

import com.asijaandroidsolution.popularmovies.model.MovieDetailsModel;
import com.asijaandroidsolution.popularmovies.model.ReviewsModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ReviewsApi {
    @GET("/3/movie/{id}/reviews")
    Call<ReviewsModel> getReviews(@Path("id") int id,
                                  @Query("api_key") String key);
}
