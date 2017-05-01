package com.creacc.weike.app.fragment;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ListView;

import com.creacc.weike.R;
import com.creacc.weike.bean.LessonEntity;
import com.creacc.weike.presenter.HomeLessonPresenter;
import com.creacc.weike.view.IHomeListView;
import com.creacc.weike.widget.adapter.ImagePagerAdapter;
import com.creacc.weike.widget.adapter.LessonAdapter;
import com.creacc.weike.widget.adapter.listview.CCAdapterHandler;

import java.util.List;

public class HomeLessonFragment extends PresenterFragment<HomeLessonPresenter> implements IHomeListView {

    protected ViewPager mBannerPager;
    protected ListView mContentList;

    public HomeLessonFragment() {
        // Required empty public constructor
    }

    public static HomeLessonFragment newInstance() {
        return new HomeLessonFragment();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_home_lesson;
    }

    @Override
    protected void initializeFragment(View rootView) {
        mBannerPager = findView(R.id.banner_pager);
        mContentList = findView(R.id.content_list);
    }

    @Override
    protected HomeLessonPresenter createPresenter() {
        return new HomeLessonPresenter(this);
    }

    @Override
    public void setBanner(final List<LessonEntity> banner) {
        mBannerPager.setAdapter(new ImagePagerAdapter(getActivity(), new ImagePagerAdapter.ImageHandler() {
            @Override
            public int getImageCount() {
                return banner.size();
            }

            @Override
            public String getImageUrl(int position) {
                return banner.get(position).getImageUrl();
            }
        }));
    }

    @Override
    public void setLessons(List<LessonEntity> lessons) {
        mContentList.setAdapter(new LessonAdapter(getActivity(), new CCAdapterHandler<>(lessons)));
    }
}
