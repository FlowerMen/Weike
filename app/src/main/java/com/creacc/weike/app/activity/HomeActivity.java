package com.creacc.weike.app.activity;

import android.support.v7.widget.Toolbar;
import android.widget.RadioGroup;

import com.creacc.weike.R;
import com.creacc.weike.app.fragment.HomeTabFragment;
import com.creacc.weike.app.fragment.UserFragment;
import com.creacc.weike.presenter.HomePresenter;
import com.creacc.weike.view.IHomeView;

/**
 * 测试提交代码1123123
 */
public class HomeActivity extends PresenterActivity<HomePresenter> implements IHomeView {

    private Toolbar mToolBar;

    private RadioGroup mTabHost;

    private HomeTabFragment mTabFragment = HomeTabFragment.newInstance();
    private UserFragment mLessonFragment = UserFragment.newInstance();

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_home;
    }

    @Override
    protected void initializeActivity() {
        mToolBar = findView(R.id.tool_bar);
        setSupportActionBar(mToolBar);
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
        //林二
    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter(this);
    }

}
