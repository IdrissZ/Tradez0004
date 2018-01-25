package com.example.tradez0004.activities;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by IdrissZ on 06-Jan-18.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
