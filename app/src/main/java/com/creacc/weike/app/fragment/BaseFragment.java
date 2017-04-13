package com.creacc.weike.app.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Creacc on 2017/4/7.
 */

public class BaseFragment extends Fragment {

    public <T extends View> T findView(View rootView, int id) {
        return (T) rootView.findViewById(id);
    }
}
