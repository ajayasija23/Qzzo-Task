package com.asijaandroidsolution.popularmovies;

import android.app.Application;

import com.asijaandroidsolution.popularmovies.web.WebServices;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new WebServices();
    }
}
