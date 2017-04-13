package com.creacc.weike.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.creacc.weike.presenter.BasePresenter;

/**
 * Created by Creacc on 2017/4/7.
 */

public abstract class PresenterFragment<T extends BasePresenter> extends BaseFragment {

    private T mPresenter;

    private boolean mIsFirstResume = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResource(), container, false);
        initializeFragment(rootView);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.onViewCreated();
        }
        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mIsFirstResume) {
            mIsFirstResume = false;
            onFirstResume();
        } else {
            if (mPresenter != null) {
                mPresenter.onViewResumed(false);
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mPresenter != null) {
            mPresenter.onViewPaused();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.onViewDestroyed();
        }
    }

    public T getPresenter() {
        return mPresenter;
    }

    protected void onFirstResume() {
        if (mPresenter != null) {
            mPresenter.onViewResumed(true);
        }
    }

    protected abstract int getLayoutResource();

    protected abstract void initializeFragment(View rootView);

    protected abstract T createPresenter();
}
