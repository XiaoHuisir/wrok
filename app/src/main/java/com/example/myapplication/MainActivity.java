package com.example.myapplication;


import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;

import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.fragment.Home_Fragment;
import com.example.myapplication.fragment.Mine_Fragment;
import com.example.myapplication.fragment.ClassifyFragment;
import com.example.myapplication.interfaces.contract.Deng_Contracy;
import com.example.myapplication.presenter.SearchLan_Presenter;

import butterknife.BindView;


public class MainActivity extends BaseActivity {


    @BindView(R.id.tl)
    TabLayout mTl;
    @BindView(R.id.fl)
    FrameLayout mFl;
    private FragmentManager manager;

    @Override
    protected Deng_Contracy.Presenter getPresenter() {
        return new SearchLan_Presenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initFragments() {
        manager = getSupportFragmentManager();
        mTl.addTab(mTl.newTab().setText("首页").setIcon(R.drawable.home));
        mTl.addTab(mTl.newTab().setText("分类").setIcon(R.drawable.classify));
        mTl.addTab(mTl.newTab().setText("我的").setIcon(R.drawable.mine));
    }

    @Override
    protected void initView() {
        addFragment(getSupportFragmentManager(), Home_Fragment.class, R.id.fl, null);
    }


    @Override
    protected void initData() {
        

    }

    @Override
    protected void initListener() {
        mTl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0) {
                    addFragment(manager, Home_Fragment.class, R.id.fl, null);
                } else if (position == 1) {
                    addFragment(manager, ClassifyFragment.class, R.id.fl, null);
                } else if (position == 2) {
                    addFragment(manager, Mine_Fragment.class, R.id.fl, null);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void showError(String errorMsg) {
//        Toast.makeText(this,errorMsg,Toast.LENGTH_LONG).show();
    }
}
