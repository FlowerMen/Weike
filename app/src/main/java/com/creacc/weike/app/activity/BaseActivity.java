package com.creacc.weike.app.activity;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Creacc on 2017/3/18.
 */

public class BaseActivity extends AppCompatActivity {

    public <T extends View> T findView(int id) {
        return (T) findViewById(id);
    }
}
