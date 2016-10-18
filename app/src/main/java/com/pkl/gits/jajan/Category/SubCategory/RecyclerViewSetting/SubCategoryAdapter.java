package com.pkl.gits.jajan.Category.SubCategory.RecyclerViewSetting;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.pkl.gits.jajan.Category.SubCategory.ViewModel.SubCategoryVM;
import com.pkl.gits.jajan.Network.api.Response.SubCategory;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ActivitySubCategoryBinding;
import com.pkl.gits.jajan.databinding.RowSubCategoryBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;
import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 18/10/16.
 */

public class SubCategoryAdapter extends GitsAdapter<SubCategory, SubCategoryRowVM, RowSubCategoryBinding> {

    public SubCategoryAdapter(List<SubCategory> collection) {
        super(collection);
    }

    @Override
    public SubCategoryRowVM createViewModel(AppCompatActivity activity, RowSubCategoryBinding binding, SubCategory item, int position) {
        return new SubCategoryRowVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_sub_category;
    }

    @Override
    public void render(RowSubCategoryBinding binding, SubCategoryRowVM viewModel, SubCategory item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(SubCategory data, int position) {

    }
}
