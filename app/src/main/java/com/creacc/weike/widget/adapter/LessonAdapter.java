package com.creacc.weike.widget.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.creacc.weike.R;
import com.creacc.weike.bean.LessonEntity;
import com.creacc.weike.widget.adapter.listview.CCAdapterHandler;
import com.creacc.weike.widget.adapter.listview.CCAdapterHolder;
import com.creacc.weike.widget.adapter.listview.CCBaseAdapter;

/**
 * Created by Creacc on 2017/4/6.
 */

public class LessonAdapter extends CCBaseAdapter<LessonEntity> {

    public LessonAdapter(Context context, CCAdapterHandler<LessonEntity> content) {
        super(context, content);
    }

    @Override
    protected CCAdapterHolder<LessonEntity> createHolder(int type) {
        return new CCAdapterHolder<LessonEntity>() {

            ImageView mLessonImage;

            @Override
            public int getResource() {
                return R.layout.adapter_list;
            }

            @Override
            public void initializeView(View convertView, int position) {
                mLessonImage = (ImageView) convertView.findViewById(R.id.lesson_image);
            }

            @Override
            public void updateView(LessonEntity content, int position) {
            }
        };
    }

}
