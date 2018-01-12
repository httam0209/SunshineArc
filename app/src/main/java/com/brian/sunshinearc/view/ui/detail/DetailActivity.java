package com.brian.sunshinearc.ui.detail;

import android.os.Bundle;

import com.brian.sunshinearc.R;

import dagger.android.support.DaggerAppCompatActivity;

public class DetailActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
