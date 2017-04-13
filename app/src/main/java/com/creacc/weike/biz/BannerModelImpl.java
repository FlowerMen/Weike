package com.creacc.weike.biz;

import com.creacc.weike.bean.LessonEntity;
import com.creacc.weike.biz.model.IBannerModel;
import com.creacc.weike.utils.TestUtils;

import java.util.List;

/**
 * Created by Creacc on 2017/3/18.
 */

public class BannerModelImpl implements IBannerModel {

    @Override
    public List<LessonEntity> getBannerLessons() {
        return TestUtils.getTestBannerLessons();
    }
}
