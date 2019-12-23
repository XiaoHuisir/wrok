package com.example.myapplication.hous;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BuildingActivity extends BaseActivity {
    @BindView(R.id.iv_build_back)
    ImageView ivBuildBack;
    @BindView(R.id.rv_huild)
    RecyclerView rvHuild;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_building;
    }

    @Override
    public void showError(String errorMsg) {

    }



    @OnClick(R.id.iv_build_back)
    public void onViewClicked() {
        startActivity(new Intent(BuildingActivity.this,BIndHouseActivity.class));
    }


}
