package com.creacc.weike.presenter;

/**
 * Created by Creacc on 2017/3/18.
 */

public class BasePresenter<T> {

    private T mView;

    public BasePresenter(T view) {
        mView = view;
    }

    T getView() {
        return mView;
    }

    public void onViewCreated() {

    }

    public void onViewResumed(boolean isFirstResume) {

    }

    public void onViewPaused() {

    }

    public void onViewDestroyed() {

    }
}
