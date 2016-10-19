package com.pkl.gits.jajan.Category.DetailCategory.RecyclerViewSetting;

import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;

import com.pkl.gits.jajan.Network.api.Response.DetailCategory;
import com.pkl.gits.jajan.databinding.RowDetailCategoryBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 19/10/16.
 */

public class DetailCategoryRowVM extends GitsRowVM<DetailCategory, RowDetailCategoryBinding> {
    public ObservableField<String> title= new ObservableField<>();
    public DetailCategoryRowVM(AppCompatActivity activity, RowDetailCategoryBinding binding, DetailCategory item) {
        super(activity,binding,item);
        title.set(item.getNama_detail_category());
    }
}
