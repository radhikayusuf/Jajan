package com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller;

import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.databinding.RowBestSellerBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;
import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 17/10/16.
 */

public class BestSellerAdapter extends GitsAdapter<BarangResponse,BestSellerRowVM, RowBestSellerBinding> {

    public BestSellerAdapter(List<BarangResponse> collection) {
        super(collection);
    }

    @Override
    public BestSellerRowVM createViewModel(AppCompatActivity activity, RowBestSellerBinding binding, BarangResponse item, int position) {
        return new BestSellerRowVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_best_seller;
    }

    @Override
    public void render(RowBestSellerBinding binding, BestSellerRowVM viewModel, BarangResponse item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(BarangResponse data, int position) {

    }
}
