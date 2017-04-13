package com.creacc.weike.biz;

import com.creacc.weike.bean.LessonEntity;
import com.creacc.weike.biz.model.ILessonModel;
import com.creacc.weike.utils.TestUtils;

import java.util.List;

/**
 * Created by Creacc on 2017/3/18.
 */

public class LessonModelImpl implements ILessonModel {

    @Override
    public List<LessonEntity> getLessons(int page) {
        return TestUtils.getTestLessons();
    }
}
