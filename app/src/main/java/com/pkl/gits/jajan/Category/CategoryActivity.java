package com.pkl.gits.jajan.Category;

import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pkl.gits.jajan.Category.ViewModel.CategoryActivityVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivityCategoryBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class CategoryActivity extends GitsActivity<CategoryActivityVM, ActivityCategoryBinding>{

    @Override
    protected int getToolbarId() {
        return R.id.toolbar_category;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_category;
    }

    @Override
    public CategoryActivityVM getViewModel() {
        Toolbar toolbar = (Toolbar) findViewById(getToolbarId());
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Semua Kategori");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        return new CategoryActivityVM(this);
    }

    @Override
    public void bindViewModel(ActivityCategoryBinding binding, CategoryActivityVM viewModel) {
        binding.setVm(viewModel);
    }


}
