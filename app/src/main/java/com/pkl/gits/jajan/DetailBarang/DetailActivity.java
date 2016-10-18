package com.pkl.gits.jajan.DetailBarang;

import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.Toolbar;

import com.pkl.gits.jajan.DetailBarang.ViewModel.DetailVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivityDetailBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class DetailActivity extends GitsActivity<DetailVM,ActivityDetailBinding> {
    Toolbar toolbar;

    @Override
    protected int getToolbarId() {
        return R.id.toolbarDetail;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_detail;
    }

    @Override
    public DetailVM getViewModel() {
        toolbar =(Toolbar) findViewById(getToolbarId());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return new DetailVM(this);
    }

    @Override
    public void bindViewModel(ActivityDetailBinding binding, DetailVM viewModel) {
        binding.setVm(viewModel);
    }
}
