package com.creacc.weike.bean;

/**
 * Created by Creacc on 2017/3/18.
 */

public class LecturerEntity {

    private String mName;

    private String mCategoryName;

    private String mDescription;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getCategoryName() {
        return mCategoryName;
    }

    public void setCategoryName(String categoryName) {
        mCategoryName = categoryName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
