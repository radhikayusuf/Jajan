package com.pkl.gits.jajan.Category.Category.RecyclerViewSetting;

import android.content.Context;
import android.databinding.ObservableField;

import com.pkl.gits.jajan.Network.api.Response.CategoryResponse;
import com.pkl.gits.jajan.databinding.RowCategoryBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 18/10/16.
 */

public class CategoryRowVM extends GitsRowVM<CategoryResponse, RowCategoryBinding> {
    public ObservableField<String> nama_category = new ObservableField<>();
    public String icon_url;

    public CategoryRowVM(Context context, RowCategoryBinding binding, CategoryResponse data) {
        super(context, binding, data);
        nama_category.set(data.getNama_category());
    }
}
