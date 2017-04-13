package com.creacc.weike.utils;

import com.creacc.weike.R;
import com.creacc.weike.bean.CategoryEntity;
import com.creacc.weike.bean.LessonEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Creacc on 2017/3/18.
 */

public class TestUtils {

    private static final int[] TEST_BANNER_IMAGE = new int[] {
            R.drawable.banner_1, R.drawable.banner_2, R.drawable.banner_3,
            R.drawable.banner_4, R.drawable.banner_5, R.drawable.banner_6,
    } ;

    private static List<LessonEntity> mTestBannerLessons;

    private static List<LessonEntity> mTestLessons;

    private static List<CategoryEntity> mTestCategories;

    static {
        mTestBannerLessons = new ArrayList<>(TEST_BANNER_IMAGE.length);
        for (int i = 0; i < TEST_BANNER_IMAGE.length; i++) {
            LessonEntity lessons = new LessonEntity();
            lessons.setImageUrl(String.valueOf(TEST_BANNER_IMAGE[i]));
            mTestBannerLessons.add(lessons);
        }

        mTestLessons = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            mTestLessons.add(new LessonEntity());
        }

        mTestCategories = new ArrayList<>();
        mTestCategories.add(new CategoryEntity(0, "精选"));
        mTestCategories.add(new CategoryEntity(0, "体育"));
        mTestCategories.add(new CategoryEntity(0, "巴萨"));
        mTestCategories.add(new CategoryEntity(0, "购物"));
        mTestCategories.add(new CategoryEntity(0, "明星"));
        mTestCategories.add(new CategoryEntity(0, "视频"));
        mTestCategories.add(new CategoryEntity(0, "健康"));
        mTestCategories.add(new CategoryEntity(0, "励志"));
        mTestCategories.add(new CategoryEntity(0, "图文"));
        mTestCategories.add(new CategoryEntity(0, "本地"));
        mTestCategories.add(new CategoryEntity(0, "动漫"));
        mTestCategories.add(new CategoryEntity(0, "搞笑"));
        mTestCategories.add(new CategoryEntity(0, "精选"));
    }

    public static List<LessonEntity> getTestBannerLessons() {
        return mTestBannerLessons;
    }

    public static List<CategoryEntity> getTestCategories() {
        return mTestCategories;
    }

    public static List<LessonEntity> getTestLessons() {
        return mTestLessons;
    }
}
