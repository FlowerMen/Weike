package com.creacc.weike.widget.adapter;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.creacc.weike.bean.CategoryEntity;

import java.util.List;

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private List<CategoryEntity> mTitles;
    private List<Fragment> mFragments;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragments, List<CategoryEntity> titles) {
        super(fm);
        mFragments = fragments;
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position).getName();
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

}