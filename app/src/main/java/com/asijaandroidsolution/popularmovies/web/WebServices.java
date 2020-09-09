package com.asijaandroidsolution.popularmovies.web;

import android.util.Log;
import android.widget.Toast;

import com.asijaandroidsolution.popularmovies.activity.details.DetailsActivity;
import com.asijaandroidsolution.popularmovies.activity.main.MainActivity;
import com.asijaandroidsolution.popularmovies.model.ApiResponse;
import com.asijaandroidsolution.popularmovies.model.MovieDetailsModel;
import com.asijaandroidsolution.popularmovies.model.ReviewsModel;
import com.asijaandroidsolution.popularmovies.utils.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServices {
    private static WebServices mInstance;
    private final DetailsApi detailsApi;
    private final ReviewsApi reviewsApi;
    private Gson gson;
    private MovieApi api;
    ApiResponse responseReceived;

    public WebServices() {
        mInstance=this;
        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .callTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(5,TimeUnit.MINUTES)
                .readTimeout(5,TimeUnit.MINUTES)
                .build();
        gson=new GsonBuilder().setLenient().create();
        api = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(MovieApi.class);
        detailsApi = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(DetailsApi.class);
        reviewsApi = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ReviewsApi.class);
    }
    public static WebServices getInstance()
    {
        return mInstance;
    }

    public void getMovies(final MainActivity mainActivity) {
        //Calling oneApi
        Call<ApiResponse> callOpenWeather=api.getMovies(Constants.KEY,1);
        callOpenWeather.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {

                if(response.body()!=null)
                    mainActivity.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {

            }
        });
    }

    //getting Moview Details
    public void getDetails(final DetailsActivity detailsActivity, int id) {
        //Calling oneApi
        Call<MovieDetailsModel> callOpenWeather=detailsApi.getDetails(id,Constants.KEY);
        callOpenWeather.enqueue(new Callback<MovieDetailsModel>() {
            @Override
            public void onResponse(Call<MovieDetailsModel> call, Response<MovieDetailsModel> response) {

                if(response.body()!=null)
                    detailsActivity.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<MovieDetailsModel> call, Throwable t) {

            }
        });
    }
    public void getReviews(final DetailsActivity detailsActivity, int id) {
        //Calling oneApi
        Call<ReviewsModel> callOpenWeather=reviewsApi.getReviews(id,Constants.KEY);
        callOpenWeather.enqueue(new Callback<ReviewsModel>() {
            @Override
            public void onResponse(Call<ReviewsModel> call, Response<ReviewsModel> response) {

                if(response.body()!=null)
                    detailsActivity.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ReviewsModel> call, Throwable t) {

            }
        });
    }

}
