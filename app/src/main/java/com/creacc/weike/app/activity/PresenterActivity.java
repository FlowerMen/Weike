package com.creacc.weike.app.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.creacc.weike.R;
import com.creacc.weike.presenter.BasePresenter;

/**
 * Created by Creacc on 2017/4/6.
 */

public abstract class PresenterActivity<T extends BasePresenter> extends BaseActivity {

    private Toolbar mToolBar;

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
        mToolBar = findView(R.id.tool_bar);
        setSupportActionBar(mToolBar);
    }

    public void setTitle(int title) {
        if (mToolBar != null) {
            mToolBar.setTitle(title);
        }
    }

    public void setTitle(String title) {
        if (mToolBar != null) {
            mToolBar.setTitle(title);
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
