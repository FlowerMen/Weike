package com.creacc.weike.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.creacc.weike.presenter.BasePresenter;

/**
 *
 * Created by Creacc on 2017/4/7.
 */

public abstract class PresenterFragment<Presenter extends BasePresenter> extends BaseFragment {

    private Presenter mPresenter;

    private boolean mIsFirstResume = true;

    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(getLayoutResource(), container, false);
        initializeFragment(mRootView);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.onViewCreated();
        }
        return mRootView;
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

    public Presenter getPresenter() {
        return mPresenter;
    }

    @SuppressWarnings("unchecked")
    protected  <T extends View> T findView(int id) {
        return (T) findView(mRootView, id);
    }

    protected void onFirstResume() {
        if (mPresenter != null) {
            mPresenter.onViewResumed(true);
        }
    }

    protected abstract int getLayoutResource();

    protected abstract void initializeFragment(View rootView);

    protected abstract Presenter createPresenter();
}
