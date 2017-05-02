package com.creacc.weike.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.creacc.weike.presenter.BasePresenter;

/**
 * 对一些共通的方法进行一些封装，简化操作，如果不满足需求可以直接继承{@link BaseActivity}
 *
 * Created by Creacc on 2017/4/6.
 */

public abstract class PresenterActivity<T extends BasePresenter> extends BaseActivity {


    private T mPresenter;

    private boolean mIsFirstResume = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        initializeActivity();
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.onViewCreated();
        }
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
    public void onDestroy() {
        super.onDestroy();
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

    protected abstract void initializeActivity();

    protected abstract T createPresenter();
}
