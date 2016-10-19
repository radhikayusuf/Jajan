package com.pkl.gits.jajan.Category.SubCategory.ViewModel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.jajan.Category.SubCategory.RecyclerViewSetting.SubCategoryAdapter;
import com.pkl.gits.jajan.Network.api.Response.CategoryResponse;
import com.pkl.gits.jajan.Network.api.Response.SubCategory;
import com.pkl.gits.jajan.databinding.RowSubCategoryBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 18/10/16.
 */

public class SubCategoryVM extends GitsVM {
    public SubCategoryAdapter adapter;
    public LinearLayoutManager linearLayoutManager;
    List<SubCategory> subCategories = new ArrayList<>();

    public SubCategoryVM(Context context, CategoryResponse response, String title) {
        super(context);
        adapter = new SubCategoryAdapter(subCategories);
        linearLayoutManager = new LinearLayoutManager(mContext);
        subCategories.addAll(response.getSubCategory());
        subCategories.add(0, new SubCategory("Semua "+title, null));
        adapter.notifyDataSetChanged();
    }
}
