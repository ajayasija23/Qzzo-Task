package com.asijaandroidsolution.popularmovies.web;

import com.asijaandroidsolution.popularmovies.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApi {
    @GET("/3/movie/popular")
    Call<ApiResponse>getMovies(@Query("api_key") String key,
                               @Query("page") int pages);
}
