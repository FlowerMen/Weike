package com.creacc.weike.app.activity;

import android.widget.RadioGroup;

import com.creacc.weike.R;
import com.creacc.weike.app.fragment.HomeTabFragment;
import com.creacc.weike.app.fragment.UserFragment;
import com.creacc.weike.presenter.HomePresenter;
import com.creacc.weike.view.IHomeView;

public class HomeActivity extends PresenterActivity<HomePresenter> implements IHomeView {

    private RadioGroup mTabHost;

    private HomeTabFragment mTabFragment = HomeTabFragment.newInstance();
    private UserFragment mLessonFragment = UserFragment.newInstance();

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_home;
    }

    @Override
    protected void initializeActivity() {
        mTabHost = findView(R.id.bottom_tab_layout);
        mTabHost.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.lesson_radio:
                        setTitle(R.string.app_name);
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_layout, mTabFragment)
                                .commitAllowingStateLoss();
                        break;
                    case R.id.user_radio:
                        setTitle("个人中心");
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_layout, mLessonFragment)
                                .commitAllowingStateLoss();
                        break;
                    default:
                        break;
                }
            }
        });
        mTabHost.check(R.id.lesson_radio);
    }

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter(this);
    }

}
