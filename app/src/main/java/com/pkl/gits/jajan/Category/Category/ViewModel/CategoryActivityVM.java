package com.pkl.gits.jajan.Category.Category.ViewModel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

import com.pkl.gits.jajan.Category.Category.RecyclerViewSetting.CategoryAdapter;
import com.pkl.gits.jajan.Network.api.Response.CategoryResponse;
import com.pkl.gits.jajan.Network.api.Response.DetailCategory;
import com.pkl.gits.jajan.Network.api.Response.SubCategory;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 18/10/16.
 */

public class CategoryActivityVM extends GitsVM {

    List<DetailCategory> detailCategoryList = new ArrayList<>();
    List<DetailCategory> detailCategoryList1 = new ArrayList<>();
    List<SubCategory> subCategories = new ArrayList<>();
    List<SubCategory> subCategories1 = new ArrayList<>();
    List<CategoryResponse> categoryResponses = new ArrayList<>();
    public CategoryAdapter adapter;
    public LinearLayoutManager linearLayoutManager;

    public CategoryActivityVM(Context context) {
        super(context);
        adapter = new CategoryAdapter(categoryResponses);

        linearLayoutManager = new LinearLayoutManager(mContext);
        Dummy();
        adapter.notifyDataSetChanged();
    }

    void Dummy(){
        detailCategoryList1.add(new DetailCategory("Kaos"));
        detailCategoryList1.add(new DetailCategory("Celana"));
        detailCategoryList1.add(new DetailCategory("Sepatu"));

        detailCategoryList.add(new DetailCategory("Mouse"));
        detailCategoryList.add(new DetailCategory("Keyboard"));
        detailCategoryList.add(new DetailCategory("Headset"));

        subCategories.add(new SubCategory("Komputer", detailCategoryList));
        subCategories.add(new SubCategory("HandPhone", detailCategoryList));

        subCategories1.add(new SubCategory("Baju Pria", detailCategoryList1));
        subCategories1.add(new SubCategory("Baju Wanita", detailCategoryList1));

        categoryResponses.add(new CategoryResponse("Elektronik", subCategories));
        categoryResponses.add(new CategoryResponse("Fashion", subCategories1));
    }
}
