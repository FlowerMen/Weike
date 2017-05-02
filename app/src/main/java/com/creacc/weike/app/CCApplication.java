package com.creacc.weike.app;

import android.app.Application;
import android.content.Context;

/**
 * 
 * Created by Creacc on 2017/3/18.
 */

public class CCApplication extends Application {

    private static Context mApplicationContext;

    public static Context getInstance() {
        return mApplicationContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = getApplicationContext();
    }
}
