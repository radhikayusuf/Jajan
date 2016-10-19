package com.pkl.gits.jajan.ListProduk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pkl.gits.jajan.ListProduk.ViewModel.ListProdukActivityVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivityListProdukBinding;

import id.gits.mvvmcore.activity.GitsActivity;

public class ListProdukActivity extends GitsActivity<ListProdukActivityVM, ActivityListProdukBinding> {

    @Override
    protected int getToolbarId() {
        return R.id.toolbar_list;
    }

    @Override
    public int getResLayout() {
        return R.layout.activity_list_produk;
    }

    @Override
    public ListProdukActivityVM getViewModel() {
        Intent i = getIntent();
        Toolbar t = (Toolbar) findViewById(R.id.toolbar_list);
        setSupportActionBar(t);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(i.getStringExtra("title"));

        return new ListProdukActivityVM(this);
    }

    @Override
    public void bindViewModel(ActivityListProdukBinding binding, ListProdukActivityVM viewModel) {
        binding.setVm(viewModel);
    }
}
