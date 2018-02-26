package com.example.tradez0004.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tradez0004.R;

public class MenuActivity extends AppCompatActivity {

    private FloatingActionButton fab_all_ads;
    private FloatingActionButton fab_post2;
    private FloatingActionButton fab_account;
    private FloatingActionButton fab_stay_safe;
    private FloatingActionButton fab_faq;
    private FloatingActionButton fab_settings;

    private Button button_all_ads;
    private Button button_post2;
    private Button button_account;
    private Button button_stay_safe;
    private Button button_faq;
    private Button button_settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menu");

        fab_all_ads = (FloatingActionButton) findViewById(R.id.fab_all_ads);
        fab_all_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        button_all_ads = (Button) findViewById(R.id.button_all_ads);
        button_all_ads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        fab_post2 = (FloatingActionButton) findViewById(R.id.fab_post2);
        fab_post2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });

        button_post2 = (Button) findViewById(R.id.button_post2);
        button_post2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });

        fab_account = (FloatingActionButton) findViewById(R.id.fab_account);
        fab_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MyAccountActivity.class);
                startActivity(intent);
            }
        });

        button_account = (Button) findViewById(R.id.button_account);
        button_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MyAccountActivity.class);
                startActivity(intent);
            }
        });

        fab_stay_safe = (FloatingActionButton) findViewById(R.id.fab_stay_safe);
        fab_stay_safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, StaySafeActivity.class);
                startActivity(intent);
            }
        });

        button_stay_safe = (Button) findViewById(R.id.button_stay_safe);
        button_stay_safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, StaySafeActivity.class);
                startActivity(intent);
            }
        });

        fab_faq = (FloatingActionButton) findViewById(R.id.fab_faq);
        fab_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });

        button_faq = (Button) findViewById(R.id.button_faq);
        button_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, FAQActivity.class);
                startActivity(intent);
            }
        });

        fab_settings = (FloatingActionButton) findViewById(R.id.fab_settings);
        fab_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        button_settings = (Button) findViewById(R.id.button_settings);
        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
