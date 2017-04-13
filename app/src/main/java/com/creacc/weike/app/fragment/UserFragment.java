package com.creacc.weike.app.fragment;

import android.view.View;
import android.widget.ImageView;

import com.creacc.weike.R;
import com.creacc.weike.presenter.UserPresenter;
import com.creacc.weike.view.IUserView;

/**
 * Created by Administrator on 2017/4/8.
 */

public class UserFragment extends PresenterFragment<UserPresenter> implements IUserView {

    private ImageView mAvatarImage;

    public UserFragment() {
    }

    public static UserFragment newInstance() {
        return new UserFragment();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_user;
    }

    @Override
    protected void initializeFragment(View rootView) {
        mAvatarImage = (ImageView) rootView.findViewById(R.id.user_avatar_image);
    }

    @Override
    protected UserPresenter createPresenter() {
        return new UserPresenter(this);
    }
}
