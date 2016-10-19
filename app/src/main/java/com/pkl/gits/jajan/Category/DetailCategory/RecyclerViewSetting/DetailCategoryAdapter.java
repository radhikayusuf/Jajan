package com.pkl.gits.jajan.Category.DetailCategory.RecyclerViewSetting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.pkl.gits.jajan.Category.DetailCategory.DetailCategoryActivity;
import com.pkl.gits.jajan.ListProduk.ListProdukActivity;
import com.pkl.gits.jajan.Network.api.Response.DetailCategory;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.RowDetailCategoryBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

/**
 * Created by root on 19/10/16.
 */

public class DetailCategoryAdapter extends GitsAdapter<DetailCategory, DetailCategoryRowVM, RowDetailCategoryBinding> {

    public DetailCategoryAdapter(List<DetailCategory> collection) {
        super(collection);
    }

    @Override
    public DetailCategoryRowVM createViewModel(AppCompatActivity activity, RowDetailCategoryBinding binding, DetailCategory item, int position) {
        return new DetailCategoryRowVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_detail_category;
    }

    @Override
    public void render(RowDetailCategoryBinding binding, DetailCategoryRowVM viewModel, DetailCategory item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(DetailCategory data, int position) {
        Intent i = new Intent(mContext, ListProdukActivity.class);
//        i.putExtra("data", data);
        i.putExtra("title", data.getNama_detail_category());
        mContext.startActivity(i);
    }
}
