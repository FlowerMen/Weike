package com.creacc.weike.view;

import com.creacc.weike.bean.LessonEntity;

import java.util.List;

/**
 * Created by Creacc on 2017/4/7.
 */

public interface IHomeListView {

    void setBanner(List<LessonEntity> banner);

    void setLessons(List<LessonEntity> lessons);
}
