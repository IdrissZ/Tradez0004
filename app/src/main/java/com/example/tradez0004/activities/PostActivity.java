package com.example.tradez0004.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tradez0004.R;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        getSupportActionBar().setTitle("Post An AD");
    }
}
