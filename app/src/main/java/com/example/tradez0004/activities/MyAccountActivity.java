package com.example.tradez0004.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tradez0004.R;

public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        getSupportActionBar().setTitle("My Account");
    }
}
