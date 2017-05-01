package com.creacc.weike.app.fragment;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Fragment基类
 *
 * Created by Creacc on 2017/4/7.
 */

public class BaseFragment extends Fragment {

    @SuppressWarnings("unchecked")
    public <T extends View> T findView(View rootView, int id) {
        return (T) rootView.findViewById(id);
    }
}
