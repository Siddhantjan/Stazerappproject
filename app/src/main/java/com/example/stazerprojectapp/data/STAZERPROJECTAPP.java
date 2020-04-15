package com.example.stazerprojectapp.data;

import android.app.Application;

import com.firebase.client.Firebase;

public class STAZERPROJECTAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
