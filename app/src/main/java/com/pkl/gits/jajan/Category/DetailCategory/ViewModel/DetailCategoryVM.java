package com.pkl.gits.jajan.Category.DetailCategory.ViewModel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

import com.pkl.gits.jajan.Category.DetailCategory.RecyclerViewSetting.DetailCategoryAdapter;
import com.pkl.gits.jajan.Network.api.Response.DetailCategory;
import com.pkl.gits.jajan.Network.api.Response.SubCategory;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 19/10/16.
 */

public class DetailCategoryVM extends GitsVM {
    List<DetailCategory> list = new ArrayList<>();
    public DetailCategoryAdapter adapter;
    public LinearLayoutManager linearLayoutManager;

    public DetailCategoryVM(Context context, SubCategory dao, String title) {
        super(context);
        adapter = new DetailCategoryAdapter(list);
        linearLayoutManager = new LinearLayoutManager(mContext);
        list.addAll(dao.getCategories());
        list.add(0 ,new DetailCategory("Semua "+title));
        adapter.notifyDataSetChanged();
    }
}
