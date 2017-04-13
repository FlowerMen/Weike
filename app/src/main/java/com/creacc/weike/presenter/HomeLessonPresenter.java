package com.creacc.weike.presenter;

import com.creacc.weike.biz.BannerModelImpl;
import com.creacc.weike.biz.LessonModelImpl;
import com.creacc.weike.view.IHomeListView;

/**
 * Created by Creacc on 2017/4/7.
 */

public class HomeLessonPresenter extends BasePresenter<IHomeListView> {

    private BannerModelImpl mBannerModel = new BannerModelImpl();

    private LessonModelImpl mLessonModel = new LessonModelImpl();

    public HomeLessonPresenter(IHomeListView view) {
        super(view);
    }

    @Override
    public void onViewCreated() {
        super.onViewCreated();
        IHomeListView view = getView();
        view.setBanner(mBannerModel.getBannerLessons());
        view.setLessons(mLessonModel.getLessons(0));
    }

}
