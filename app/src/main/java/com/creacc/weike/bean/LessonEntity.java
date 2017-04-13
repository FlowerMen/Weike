package com.creacc.weike.bean;

import java.util.List;

/**
 * Created by Creacc on 2017/3/18.
 */

public class LessonEntity {

    private String mImageUrl;

    private String mName;

    private String mDescription;

    private String mLiveRoom;

    private boolean mIsSigningUp;

    private boolean mIsFree;

    private int mAirTime;

    private int mPopularity;

    private List<PopularUserEntity> mPopularUsers;

    private List<LecturerEntity> mLecturers;

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getLiveRoom() {
        return mLiveRoom;
    }

    public void setLiveRoom(String liveRoom) {
        mLiveRoom = liveRoom;
    }

    public boolean isSigningUp() {
        return mIsSigningUp;
    }

    public void setSigningUp(boolean signingUp) {
        mIsSigningUp = signingUp;
    }

    public boolean isFree() {
        return mIsFree;
    }

    public void setFree(boolean free) {
        mIsFree = free;
    }

    public int getAirTime() {
        return mAirTime;
    }

    public void setAirTime(int airTime) {
        mAirTime = airTime;
    }

    public int getPopularity() {
        return mPopularity;
    }

    public void setPopularity(int popularity) {
        mPopularity = popularity;
    }

    public List<PopularUserEntity> getPopularUsers() {
        return mPopularUsers;
    }

    public void setPopularUsers(List<PopularUserEntity> popularUsers) {
        mPopularUsers = popularUsers;
    }

    public List<LecturerEntity> getLecturers() {
        return mLecturers;
    }

    public void setLecturers(List<LecturerEntity> lecturers) {
        mLecturers = lecturers;
    }
}
