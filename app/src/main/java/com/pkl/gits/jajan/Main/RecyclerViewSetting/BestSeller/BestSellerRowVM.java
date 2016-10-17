package com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.nfc.tech.NfcA;

import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.databinding.RowBestSellerBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by root on 17/10/16.
 */

public class BestSellerRowVM extends GitsRowVM<BarangResponse, RowBestSellerBinding>{
    public String nama, harga, diskon, url;
    public BestSellerRowVM(Context context, RowBestSellerBinding binding, BarangResponse data) {
        super(context, binding, data);
        nama = data.getNama();
        harga = data.getHarga();
        diskon = data.getDiskons().get(0).getNilai();
        url = data.getUrl_image().get(0);
    }
}
