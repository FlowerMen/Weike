package com.creacc.weike.widget.adapter.listview;

import android.view.View;

/**
 * Created by apple on 2015/12/12.
 */
public interface CCAdapterHolder<ContentType> {

    int getResource();

    void initializeView(View rootView);

    void updateView(ContentType content, int position);
}