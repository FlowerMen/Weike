package com.creacc.weike.bean;

/**
 * Created by Creacc on 2017/4/6.
 */

public class CategoryEntity {

    private int mId;

    private String mName;

    public CategoryEntity(int id, String name) {
        mId = id;
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
