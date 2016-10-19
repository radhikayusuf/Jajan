package com.pkl.gits.jajan.Category.DetailCategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pkl.gits.jajan.Category.DetailCategory.ViewModel.DetailCategoryVM;
import com.pkl.gits.jajan.Network.api.Response.DetailCategory;
import com.pkl.gits.jajan.Network.api.Response.SubCategory;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivityDetailCategoryBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class DetailCategoryActivity extends GitsActivity<DetailCategoryVM, ActivityDetailCategoryBinding>{

    @Override
    protected int getToolbarId() {
        return R.id.toolbar_detail_category;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_detail_category;
    }

    @Override
    public DetailCategoryVM getViewModel() {
        Intent i = getIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_detail_category);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(!i.getStringExtra("title").equalsIgnoreCase("") ? i.getStringExtra("title") : "Kosong");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return new DetailCategoryVM(this, (SubCategory) i.getSerializableExtra("data"), i.getStringExtra("title"));
    }

    @Override
    public void bindViewModel(ActivityDetailCategoryBinding binding, DetailCategoryVM viewModel) {
        binding.setVm(viewModel);
    }
}
