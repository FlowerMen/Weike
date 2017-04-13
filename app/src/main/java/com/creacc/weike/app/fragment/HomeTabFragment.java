package com.creacc.weike.app.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.creacc.weike.R;
import com.creacc.weike.bean.CategoryEntity;
import com.creacc.weike.presenter.HomeTabPresenter;
import com.creacc.weike.view.IHomeTabView;
import com.creacc.weike.widget.adapter.FragmentAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Creacc on 2017/4/8.
 */

public class HomeTabFragment extends PresenterFragment<HomeTabPresenter> implements IHomeTabView {

    private TabLayout mTabLayout;
    private ViewPager mFragmentPager;
    private List<Fragment> mFragments;

    public static HomeTabFragment newInstance() {
        return new HomeTabFragment();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home_tab;
    }

    @Override
    protected void initializeFragment(View rootView) {
        mFragmentPager = findView(rootView, R.id.fragment_pager);
        mTabLayout = findView(rootView, R.id.tab_layout);
        mTabLayout.setupWithViewPager(mFragmentPager);
    }

    @Override
    protected HomeTabPresenter createPresenter() {
        return new HomeTabPresenter(this);
    }

    @Override
    public void setCategory(List<CategoryEntity> categories) {
        if (mFragments == null) {
            int size = categories.size();
            mFragments = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                mTabLayout.addTab(mTabLayout.newTab().setText(categories.get(i).getName()));
                mFragments.add(HomeLessonFragment.newInstance());
            }
        }
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getChildFragmentManager(), mFragments, categories);
        mFragmentPager.setAdapter(fragmentAdapter);
    }
}
