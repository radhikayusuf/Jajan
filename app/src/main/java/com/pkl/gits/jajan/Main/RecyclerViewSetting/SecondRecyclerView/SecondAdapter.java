package com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView;

import android.support.v7.app.AppCompatActivity;

import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.databinding.RowSecondCategoryBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

/**
 * Created by root on 17/10/16.
 */

public class SecondAdapter extends GitsAdapter<BarangResponse, SecondRowVM, RowSecondCategoryBinding> {
    public SecondAdapter(List<BarangResponse> collection) {
        super(collection);
    }

    @Override
    public SecondRowVM createViewModel(AppCompatActivity activity, RowSecondCategoryBinding binding, BarangResponse item, int position) {
        return new SecondRowVM(activity, binding, item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_second_category;
    }

    @Override
    public void render(RowSecondCategoryBinding binding, SecondRowVM viewModel, BarangResponse item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(BarangResponse data, int position) {

    }
}
