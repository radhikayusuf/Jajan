package com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView;

import android.content.Context;

import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.databinding.RowBestSellerBinding;
import com.pkl.gits.jajan.databinding.RowSecondCategoryBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 17/10/16.
 */

public class SecondRowVM extends GitsRowVM<BarangResponse, RowSecondCategoryBinding>{
    public String nama, harga, url, diskon;
    public SecondRowVM(Context context, RowSecondCategoryBinding binding, BarangResponse data) {
        super(context, binding, data);
        nama = data.getNama();
        harga = data.getHarga();
    }
}
