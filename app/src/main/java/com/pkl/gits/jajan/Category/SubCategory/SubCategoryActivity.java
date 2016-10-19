package com.pkl.gits.jajan.Category.SubCategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pkl.gits.jajan.Category.SubCategory.ViewModel.SubCategoryVM;
import com.pkl.gits.jajan.Network.api.Response.CategoryResponse;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivitySubCategoryBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class SubCategoryActivity extends GitsActivity<SubCategoryVM, ActivitySubCategoryBinding> {

    @Override
    protected int getToolbarId() {
        return R.id.toolbar_sub_category;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_sub_category;
    }

    @Override
    public SubCategoryVM getViewModel() {
         Intent i = getIntent();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_sub_category);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(i.getStringExtra("judul"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    return new SubCategoryVM(this, (CategoryResponse) i.getSerializableExtra("data"), i.getStringExtra("judul"));
    }

    @Override
    public void bindViewModel(ActivitySubCategoryBinding binding, SubCategoryVM viewModel) {
        binding.setVm(viewModel);
    }
}
