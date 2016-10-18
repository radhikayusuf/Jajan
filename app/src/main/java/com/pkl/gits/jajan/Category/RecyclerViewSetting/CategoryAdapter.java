package com.pkl.gits.jajan.Category.RecyclerViewSetting;

import android.support.v7.app.AppCompatActivity;

import com.pkl.gits.jajan.Network.api.Response.CategoryResponse;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.RowCategoryBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

/**
 * Created by root on 18/10/16.
 */

public class CategoryAdapter extends GitsAdapter<CategoryResponse, CategoryRowVM, RowCategoryBinding> {

    public CategoryAdapter(List<CategoryResponse> collection) {
        super(collection);
    }

    @Override
    public CategoryRowVM createViewModel(AppCompatActivity activity, RowCategoryBinding binding, CategoryResponse item, int position) {
        return new CategoryRowVM(activity, binding, item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_category;
    }

    @Override
    public void render(RowCategoryBinding binding, CategoryRowVM viewModel, CategoryResponse item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(CategoryResponse data, int position) {

    }
}
