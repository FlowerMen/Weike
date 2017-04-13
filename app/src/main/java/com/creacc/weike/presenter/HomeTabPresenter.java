package com.creacc.weike.presenter;

import com.creacc.weike.biz.CategoryModelImpl;
import com.creacc.weike.view.IHomeTabView;

/**
 * Created by Creacc on 2017/4/6.
 */

public class HomeTabPresenter extends BasePresenter<IHomeTabView> {

    private CategoryModelImpl mCategoryModel = new CategoryModelImpl();

    public HomeTabPresenter(IHomeTabView view) {
        super(view);
    }

    @Override
    public void onViewResumed(boolean isFirstResume) {
        getView().setCategory(mCategoryModel.getCategories());
    }
}
