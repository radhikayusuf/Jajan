package com.pkl.gits.jajan.Category.SubCategory.RecyclerViewSetting;

import android.content.Context;
import android.databinding.ObservableField;

import com.pkl.gits.jajan.Network.api.Response.SubCategory;
import com.pkl.gits.jajan.databinding.RowSubCategoryBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 18/10/16.
 */

public class SubCategoryRowVM extends GitsRowVM<SubCategory, RowSubCategoryBinding> {
    public ObservableField<String> title = new ObservableField<>();
    public String url_image;
    public SubCategoryRowVM(Context context, RowSubCategoryBinding binding, SubCategory data) {
        super(context, binding, data);
        title.set(data.getNama_sub_category());
    }
}
