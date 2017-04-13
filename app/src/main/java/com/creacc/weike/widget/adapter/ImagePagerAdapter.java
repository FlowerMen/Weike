package com.creacc.weike.widget.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Creacc on 2017/3/18.
 */

public class ImagePagerAdapter extends PagerAdapter {

    private static final int DEFAULT_LOOP_FACTOR = 100;

    private Context mContext;

    private ImageHandler mImageHandler;

    private boolean mIsLoop;

    private int mLoopFactor;

    public ImagePagerAdapter(Context context, ImageHandler imageHandler) {
        this(context, imageHandler, false);
    }

    public ImagePagerAdapter(Context context, ImageHandler imageHandler, boolean isLoop) {
        this(context, imageHandler, isLoop, DEFAULT_LOOP_FACTOR);
    }

    public ImagePagerAdapter(Context context, ImageHandler imageHandler, boolean isLoop, int loopFactor) {
        mContext = context;
        mImageHandler = imageHandler;
        mIsLoop = isLoop;
        mLoopFactor = loopFactor;
    }

    public void setLoop(boolean loop) {
        mIsLoop = loop;
    }

    public void beginLoop(ViewPager pager) {
        pager.setCurrentItem(mImageHandler.getImageCount() * (DEFAULT_LOOP_FACTOR / 2));
    }

    @Override
    public int getCount() {
        int imageCount = mImageHandler.getImageCount();
        return mIsLoop ? imageCount * mLoopFactor : imageCount;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Glide.with(mContext)
                .load(Integer.parseInt(mImageHandler.getImageUrl(position)))
                .asBitmap()
                .into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public interface ImageHandler {

        int getImageCount();

        String getImageUrl(int position);
    }
}
