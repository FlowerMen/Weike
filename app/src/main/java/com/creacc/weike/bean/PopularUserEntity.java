package com.creacc.weike.bean;

/**
 * Created by Creacc on 2017/3/18.
 */

public class PopularUserEntity {

    private String mName;

    private int mFriendCount;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getFriendCount() {
        return mFriendCount;
    }

    public void setFriendCount(int friendCount) {
        mFriendCount = friendCount;
    }
}
